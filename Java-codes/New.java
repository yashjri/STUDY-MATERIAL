import java.awt.*;
import java.awt.event.*;

class New extends Frame {
    
    public New() 
    {
        this.setVisible(true);
        this.setTitle("FIRST FRAME IN VSCODE");
        this.setSize(300, 200);
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

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED); // Set the color of the rectangle
        g.drawRect(50, 50, 200, 100); // Draw the rectangle at (50, 50) with width 200 and height 100
    }

    public static void main(String[] args) {
        New n1 = new New();
    }
}
