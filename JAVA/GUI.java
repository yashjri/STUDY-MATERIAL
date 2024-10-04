import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[]args)
    {
        String name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "HI! its an honour to meet you" +name,name,0);

        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        JOptionPane.showMessageDialog(null,"You are " +age+ "years old");
    }
}
