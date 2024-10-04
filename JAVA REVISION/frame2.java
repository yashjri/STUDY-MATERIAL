import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class frame2 extends Frame {
    public frame2()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.setBackground(Color.YELLOW);
        this.setTitle("GUI Frame");
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawString("Hello, this is a custom string!", 50, 50);
        g.drawString("This is the besst thing in world", 70, 70);
    }
    public static void main(String[] args) {
        frame2 s1= new frame2();
    }
}
