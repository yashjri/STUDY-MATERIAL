import java.awt.*;
import java.awt.event.*;
public class Frames extends Frame{
    Frames()
    {
        this.setSize(100,200);
        this.setTitle("JAVA FRAME");
         this.setVisible(true);
        this.setBackground(Color.CYAN);
        this.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                dispose(); // Close and release resources
                System.exit(0); // Terminate the application
            }
        });
    }
    public static void main(String[] args)
    {
        Frames f1= new Frames();
    }
}
