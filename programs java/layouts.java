import java.awt.*;
import javax.swing.*;

public class layouts {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("CR7");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton button = new JButton("SUBMIT");
        panel.add(button,BorderLayout.CENTER);
        frame.add(panel);
        frame.setVisible(true);
    }
}
