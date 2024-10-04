import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.*;

public class layouts extends JFrame {
    public layouts(){
        this.setVisible(true);
        this.setTitle("Layouts by Java Swing");
        this.setSize(400,700);

        JButton b1= new JButton("NORTH");
        JButton b2= new JButton("SOUTH");
        JButton b3= new JButton("EAST");
        JButton b4= new JButton("WEST");

        this.add(b1, BorderLayout.NORTH);
        this.add(b2, BorderLayout.SOUTH);
        this.add(b3, BorderLayout.EAST);
        this.add(b4, BorderLayout.WEST);
    }
    public void pics(){
        JLabel bg;
        setTitle("FRAME USING THE JAVA SWING METHOD");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon ig= new ImageIcon("wall.jpg");
        bg= new JLabel("This is an image we used in frame", ig, JLabel.CENTER);
        bg.setBounds(0, 0, 300, 500);
        add(bg);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawString("Hello this is a custom string!", 50, 50);
        g.drawString("CR7 is best in world", 70, 70);
    }

    public static void main(String[] args) {
        layouts l1= new layouts();
        l1.pics();
        l1.repaint(); //calling repaint instead of paints
    }
}
