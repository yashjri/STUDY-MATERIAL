import java.util.InputMismatchException;
import java.util.Scanner;

public class excep_handling {
    public static void main(String[] args) {
        try {
            int arr[];
            System.out.println("Enter a number to divide :");
            java.util.Scanner sc= new Scanner(System.in);

            int a=sc.nextInt();
            System.out.println("Enter a number to divide by :");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("Result :" +c);
            System.out.println("Enter the length of array :");
            int length = sc.nextInt();
            arr=new int[length];
            System.out.println("Enter values for the array:");

            for(int i=0; i<length; i++)
            {
                arr[i]=sc.nextInt();
            }
            sc.close();
        } 
        catch (ArithmeticException e) {
            System.out.println("You cant divide by zero");
        }
        catch (InputMismatchException e2) {
            System.out.println("Please enter a whole number only");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter a perfect array values");
        }
        catch (Exception e3) {
            System.out.println("Something wrong");
        }
        finally{
            System.out.println("THanks for coding!");
        }
    }
    
}
