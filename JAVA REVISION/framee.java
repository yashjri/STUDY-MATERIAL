import java.awt.Color;
import java.awt.Frame;

public class framee extends Frame {
    public framee() // constructor
    {
        this.setVisible(true);
        this.setSize(400,500);
        this.setTitle("First Frame using the AWT package");
    }

    public void setBackgroundColor(Color cr) // for background color
    {
        this.setBackground(cr);
    }

    public static void main(String[] args) {
        framee f1 = new framee(); // object of the class
        f1.setBackgroundColor(Color.RED);
    }
}
