import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI implements ActionListener
{
     private JLabel label;
     private int count = 0;
     private JFrame frame;
     private JPanel panel; 
    public GUI()
    {
        JFrame frame=new JFrame();
        
        JButton button=new JButton("click me");
        button.addActionListener(this);

        label = new JLabel("Number of click : 0");


         panel=new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("FIRST gui");
        frame.pack();
        frame.setVisible(true);
    }
public static void main(String[] args) 
{
  // TO DO AUTO GENRATED METHOD STUB    
  new GUI();
}
@Override
public void actionPerformed(ActionEvent e) 
{
  count++;
  label.setText("Number of click : "+ count);
}
}
