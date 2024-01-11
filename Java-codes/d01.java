import java.awt.Frame;
import java.awt.event.*;
public class d01 extends Frames{
    d01()
    {
        this.setVisible(true);
        this.setSize(100,200);
        this.setTitle("first proper day coding");
        this.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                dispose(); // Close and release resources
                System.exit(0); // Terminate the application
            }
        });
    }
    public static void main(String[]args)
    {
        d01 d=new d01();
    }
}
