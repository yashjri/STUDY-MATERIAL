/* UNIT-4 INTRO TO APPLETS IN JAVA
 * Applets are small self contained program written in java programming language.
 * It is designed to be execute within the web browser that support java plugin.
 * However due to security reason and advancement in web tech we dont prefer to use the applet in program.
 * 
 * Applets are import by using the applet package in java.
 * SYNTAX:- import java.applet.Applet;
 * 
 * Applet have a life cycle by which we can create a applet and how to manage it.
 * 
 *  5 steps :-
    1- init() method :-
    This method call only once in the entire life of cycle of applet. this is the place where we initialize variable.

    2- start() method :-
    It is also called as to restart an applet after it has been stopped.This method is called each time an applet's html document displayed on the scren.

    3- paint() method :-
    It is called each time when we want to display something in the applet.

    4- stop() method :-
    This method is called when a web-browser leave the HTML document containing applet when it goes to another page.
    We have to use this method to suspend thread that dont need to run when applet is not visible.

    5- destroy() method :-
    This method called when the enviroment determines that our applet need to remove from the memory.
    It is always call before destroy method.
 */



import java.applet.Applet;
import java.awt.Graphics;

public class firstapplet extends Applet{
    public void paint(Graphics g)
    {
        g.drawString("HI this is me ", 50, 20);
    }
    public static void main(String[] args) {
        firstapplet f1= new firstapplet();
        f1.paint(null);
    }
}
