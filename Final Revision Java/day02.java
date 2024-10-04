import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {

    //for getting input from user we use scanner class from util package
    Scanner sc=new Scanner(System.in);
    System.out.println("whats your name?");
    String name = sc.nextLine();

    System.out.println("ENter your age");
    int age=sc.nextInt();

    System.out.println("student details are as follows:");
    System.out.println("Name :"+name);
    System.out.println("Age :"+age);
    }
    

}
