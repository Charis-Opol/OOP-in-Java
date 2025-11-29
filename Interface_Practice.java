interface Animal{
    public void move();
    public void sleep();
}

interface Vertebrate {
    public void backborne();
}

class Snake implements Animal, Vertebrate{
    public void move(){
        System.out.println("The snake slithers!");
    }

    public void sleep(){
        System.out.println("ZZZ");
    }

    public void backborne(){
        System.out.println("The snake has no barkborne");
    }
}

public class Interface_Practice {
    public static void main(String[] args){
        Snake snake = new Snake();
        snake.move();
        snake.sleep();
        snake.backborne();
    }
}
