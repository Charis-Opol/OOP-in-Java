import java.awt.*;

public class Einstien extends Panel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(50, 50, 40, 40);
        g.drawRect(60, 80, 225, 30);
        g.drawOval(75, 65, 20, 20);
        g.drawLine(35, 60, 100, 120);
        g.drawString("Out of clutter, find simplicity", 110, 70);
        g.drawString("Albert Einstein", 130, 100);
    }

    public static void main(String[] args) {
        Frame f = new Frame("Einstien");
        Einstien p = new Einstien();
        f.add(p);
        f.setSize(400, 200);
        f.setVisible(true);
    }

}
