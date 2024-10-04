/*Exception handling
It refer to a mechanism of dealing with runtime error or exceptional situation that may occur during the execution of a program,
allow you to catch and handle the exception gracefully , rather than having program terminate abruptly.
there  are sixe type of exception handling in java
a. Arithmetic 
b. ArrayStore
c. FileNotBound
d. IO
e. ArrayIndexOutOFBounds
f. StringIndexOutOfBounds

there are four ways to handle these exception
a. find exception
b. inform error
c. recieve error
d. take error */

public class Exception {
    public static void main(String[] args)
    {
        try
        {
            int result = 10/0;
            System.out.println("Result:" + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArthematicException:" + e.getMessage());
        }
    }
}
