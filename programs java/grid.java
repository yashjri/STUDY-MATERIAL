import java.awt.*;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;


public class grid extends JFrame {
    grid(){
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("GRID layout");
        this.addWindowFocusListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        Button b1= new Button("CR7");
        Button b2= new Button("LM10");
        this.setLayout(new GridLayout(1,2));
        this.add(b1);
        this.add(b2);
    }
    public static void main(String[] args)
    {
        grid g1=new grid();
    }
}
