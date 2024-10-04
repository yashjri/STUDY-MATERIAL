import java.awt.*;
import javax.swing.*;
public class form extends JFrame{
    public form()
    {
        this.setVisible(true);
        this.setTitle("MASMS COLLEGE FORM");
        this.setSize(500,800);
        this.setBackground(Color.WHITE);
    }
@Override
    public void paint(Graphics g)
    {
        //super.paint(g);
        g.drawOval(100, 100, 100, 100);
        g.setColor(Color.WHITE);
        g.drawString("WELCOME TO THE ADDMISSION SITE",100,100);
        g.drawRect(200, 200, 200, 200);
    }
    public static void main(String[]args)
    {
      form f1=new form();
      f1.paint(null);
    }
}