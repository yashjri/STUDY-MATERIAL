import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class frame3 extends Frame{
    public frame3()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.setBackground(Color.YELLOW);
        this.setTitle("GUI Frame");
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawOval(100, 100, 100, 100);
        g.setColor(Color.BLACK);

        g.drawRect(200, 200, 200, 200);
    }
    public static void main(String[] args) {
        frame3 t1 = new frame3();
        t1.paint(null);
    }
}
