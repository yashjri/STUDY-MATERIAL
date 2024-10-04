/*
 * Lets create a simple syntax for using AWT Frame:
 * 
 * import java.awt.Frame;
 * class class_name extends Frame
 * {
 *  class_name_constructor()
 * {
 *  //method of frame
 * }
 * public static void main(String[] args)
 * {
 *  //call the class_name
 * }
 * }
 * 
 * For creating frame we use 3 functions:
 * 1. setTitle()
 * 2. setSize()
 * 3. setVisible()
 * 
 * Suppose we have to add color in background so what we do? here's the code first import awt.color
 * then
 * Call Color class :-
 *          Color color_class_object = Color.color_Name_in_CAPS;
 * then
 * use setBackground method
 *           frame_object.setBackground(color_class_object);
 * 
 * Now lets learn hwo to add graphics or shapes in the frame
 * First import the awt.Graphics;
 * then
 * create a class which use the Graphic class and also make a object of graphic lass
 * for ex: public void paint(Graphics g)
 *              {
*                   //this 'g' object will help us to access the graphics class.
                    use super method to use it.              
 *              }
 * there are various method or option or shapes to create by using the graphics class
 * lets write some of those shape's implementation
 * g.drawstring("Wrtie strings here",dimension_of_X-axis, dimension_of_Y_axis);
 * g.draw_Shape_name method use to just create shapes but when you have to fill any specific color to the shape we use fill_shape_name;
 * 
 * Ex- g.fillOval(120,150,45,45);
 * Ex- g.drawRect(50,70,80,40);
 */


import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;

class awtpackage extends Frame {
    awtpackage(){
        setTitle("First frame using AWT Frame");
        setSize(600,600);
        setVisible(true);
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("HI IM HERE", 50, 50);
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 45, 45);
        g.drawRect(50, 70, 80, 40);
        g.fillRect(200, 80, 70, 40);
        g.draw3DRect(300, 400, 60, 70, false);
    }

    public static void main(String[] args) {
        awtpackage a1= new awtpackage();
    }
}
