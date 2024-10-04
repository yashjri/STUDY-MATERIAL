import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class frame1 extends JFrame{

    public frame1(){
        this.setVisible(true);
        this.setTitle("CRISTIANO RONALDO");
        this.setSize(500,500);
    }
    @Override
    public void run(Graphics g){
        super.run(g);
        g.drawRect(200, 200, 200, 200);
    }

    public static void main(String[] args) {
        frame1 f1= new frame1();
        f1.run(null);
    }
}
