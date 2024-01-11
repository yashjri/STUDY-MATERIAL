import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


 class Main extends JFrame
 {
     Main()
     {
         setVisible(true);
         setTitle("THIS IS THE FIRST FRAME I CREATED USING THE JAVA");
         setSize(500,500);
         setLayout(null);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
    public static void main(String[] args)
    {
        Main m1 = new Main();
    }
}