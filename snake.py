# snake.py
import pygame
import sys
import random

# ----------------------------- Settings -----------------------------
CELL_SIZE = 20
GRID_WIDTH = 30   # number of cells horizontally
GRID_HEIGHT = 20  # number of cells vertically
WINDOW_WIDTH = CELL_SIZE * GRID_WIDTH
WINDOW_HEIGHT = CELL_SIZE * GRID_HEIGHT
FPS = 10  # starting speed (increase to make it harder)
# --------------------------------------------------------------------

# Colors (R, G, B)
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
DARK_GRAY = (40, 40, 40)
GREEN = (0, 200, 0)
RED = (200, 0, 0)
YELLOW = (255, 200, 0)

# Directions
UP = (0, -1)
DOWN = (0, 1)
LEFT = (-1, 0)
RIGHT = (1, 0)


def draw_cell(surface, pos, color):
    x, y = pos
    rect = pygame.Rect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE)
    pygame.draw.rect(surface, color, rect)


def random_food_position(snake):
    while True:
        pos = (random.randrange(GRID_WIDTH), random.randrange(GRID_HEIGHT))
        if pos not in snake:
            return pos


def show_text_center(surface, text, size, color, y_offset=0):
    font = pygame.font.SysFont(None, size)
    surf = font.render(text, True, color)
    rect = surf.get_rect(center=(WINDOW_WIDTH // 2, WINDOW_HEIGHT // 2 + y_offset))
    surface.blit(surf, rect)


def main():
    pygame.init()
    screen = pygame.display.set_mode((WINDOW_WIDTH, WINDOW_HEIGHT))
    pygame.display.set_caption("Snake")
    clock = pygame.time.Clock()

    # Initialize game state
    snake = [(GRID_WIDTH // 2, GRID_HEIGHT // 2),
             (GRID_WIDTH // 2 - 1, GRID_HEIGHT // 2),
             (GRID_WIDTH // 2 - 2, GRID_HEIGHT // 2)]
    direction = RIGHT
    next_direction = RIGHT
    food = random_food_position(snake)
    score = 0
    speed_increase_every = 5  # increase speed every N points

    running = True
    paused = False
    game_over = False

    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
                continue
            if event.type == pygame.KEYDOWN:
                if event.key in (pygame.K_w, pygame.K_UP):
                    next_direction = UP
                elif event.key in (pygame.K_s, pygame.K_DOWN):
                    next_direction = DOWN
                elif event.key in (pygame.K_a, pygame.K_LEFT):
                    next_direction = LEFT
                elif event.key in (pygame.K_d, pygame.K_RIGHT):
                    next_direction = RIGHT
                elif event.key == pygame.K_p:
                    paused = not paused
                elif event.key == pygame.K_r and game_over:
                    # Restart game
                    snake = [(GRID_WIDTH // 2, GRID_HEIGHT // 2),
                             (GRID_WIDTH // 2 - 1, GRID_HEIGHT // 2),
                             (GRID_WIDTH // 2 - 2, GRID_HEIGHT // 2)]
                    direction = RIGHT
                    next_direction = RIGHT
                    food = random_food_position(snake)
                    score = 0
                    FPS_local = FPS
                    game_over = False

        if not running:
            break

        if paused:
            # Draw paused screen
            screen.fill(BLACK)
            show_text_center(screen, "PAUSED", 64, YELLOW)
            show_text_center(screen, "Press P to resume", 28, WHITE, y_offset=60)
            pygame.display.flip()
            clock.tick(10)
            continue

        if not game_over:
            # Prevent reversing directly onto itself
            if (next_direction[0] * -1, next_direction[1] * -1) != direction:
                direction = next_direction

            # Move snake
            head_x, head_y = snake[0]
            dx, dy = direction
            new_head = (head_x + dx, head_y + dy)

            # Check wall collision
            if (not 0 <= new_head[0] < GRID_WIDTH) or (not 0 <= new_head[1] < GRID_HEIGHT):
                game_over = True
            # Check self collision
            elif new_head in snake:
                game_over = True
            else:
                snake.insert(0, new_head)

                # Check food collision
                if new_head == food:
                    score += 1
                    food = random_food_position(snake)
                    # optional: increase speed every few points
                    if score % speed_increase_every == 0:
                        # increase speed by 1 FPS step
                        # cap it so it doesn't become uncontrollable
                        if clock.get_fps() < 60:
                            # we'll adjust target FPS by updating local fps variable below
                            pass
                else:
                    snake.pop()  # remove tail if not eating

        # Drawing
        screen.fill(DARK_GRAY)

        # Grid (optional subtle grid lines)
        for x in range(0, WINDOW_WIDTH, CELL_SIZE):
            pygame.draw.line(screen, BLACK, (x, 0), (x, WINDOW_HEIGHT))
        for y in range(0, WINDOW_HEIGHT, CELL_SIZE):
            pygame.draw.line(screen, BLACK, (0, y), (WINDOW_WIDTH, y))

        # Draw food
        draw_cell(screen, food, RED)

        # Draw snake (head brighter)
        for i, segment in enumerate(snake):
            color = GREEN if i > 0 else YELLOW
            draw_cell(screen, segment, color)

        # Score
        font_small = pygame.font.SysFont(None, 24)
        score_surf = font_small.render(f"Score: {score}", True, WHITE)
        screen.blit(score_surf, (5, 5))

        if game_over:
            show_text_center(screen, "GAME OVER", 64, RED)
            show_text_center(screen, f"Score: {score}", 40, WHITE, y_offset=60)
            show_text_center(screen, "Press R to restart or close window to quit", 24, WHITE, y_offset=110)

        pygame.display.flip()

        # Adjust tick: simple dynamic difficulty
        target_fps = FPS + (score // speed_increase_every)
        # cap the fps
        if target_fps > 30:
            target_fps = 30
        clock.tick(target_fps)

    pygame.quit()
    sys.exit()


if __name__ == "__main__":
    main()