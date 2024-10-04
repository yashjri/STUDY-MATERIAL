/*
 * EXCEPTION :-
 * it is a condition that is caused by the run time error.
 * when java interpreter encounters a runtime error viz divide by zero, it creates an exception object and throws it.
 * 
 * MECHANISM OF EXCEPTION HANDLING :-
 * 1. Find the exception
 * 2. Inform the error
 * 3. Recieve the error
 * 4. Take action
 * 
 * EXCEPTION IN JAVA DIVIDE IN 2 MAJOR TYPE :-
 * 1. Checked Exception :- THese are handled by using try-catch block in code itself.
 * 2. Unchecked Exception :- THese are not essentially handled in program.
 *          JVM handles such exceptions.
 *          java.lang.RuntimeException is used to handle unchecked Exception.
 * 
 * SYNTAX OF TRY-CATCH BLOCL :-
 * try {
 *  //here exception are write
 * }
 * catch(Exception type e)
 * {
 *  code to handle exception
 * }
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class arrayexcep {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of array :");
            int length = sc.nextInt();
            int arr[]= new int[length];
            System.out.println("Enter values for array");

            for(int i=0; i<length; i++)
            {
                try {
                    arr[i]=sc.nextInt();
                } catch (InputMismatchException e) {
                    throw new NumberFormatException("Invalid input. please enter a integer");
                }
            }
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Invalid Input :" + e.getMessage());
        }
        finally{
            System.out.println("thank you for running our code");
        }
    }
}
