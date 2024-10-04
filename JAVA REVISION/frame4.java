import javax.swing.*;
class frame4 extends JFrame
{
    public frame4()
    {
        JLabel background;
        setSize(500,500); // for size
        setLayout(null);
        setTitle("Frmae using the JLabel");
        setDefaultCloseOperation(EXIT_ON_CLOSE); // for closing program 
        ImageIcon img= new ImageIcon("cat.jpg"); // using image
        background = new JLabel("this is the image .", img,JLabel.CENTER); // using image in center
        background.setBounds(0, 0, 500, 500); // setting dimensions
        add(background);
        setVisible(true);
    }

    public static void main(String[] args) {
        new frame4();
    }
}
