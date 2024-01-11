// these are my code of program i made in the laptop and these are related to my course 

import java.util.*;

class Address
{
    private String Name;
    private String desgination;

    Address(String n,String s)
    {
        Name=n;
        desgination=s;
    }



    public String toString()
    {
        System.out.println("Name-->"+Name);
        System.out.println("Desgination-->"+desgination);
        return Name+desgination;
    }
}


public class third
{
    public static void main(String[] args)
    {
     //let create linked list using java.util
        LinkedList<Integer> a=new LinkedList<Integer>();
        a.add(300);
        a.add(200);
        a.add(100);
        a.add(50);
        System.out.println("linked list is ");
        System.out.println(a);
        System.out.println("now let's remove the list 's element");
        a.remove(2);
        System.out.println("after deletion of element");
        System.out.println(a+"\n");


        System.out.println("let make hash also using java.util");
        HashSet<Integer> h=new HashSet<Integer>();
        h.add(1000);
        h.add(2000);
        h.add(3000);
        h.add(4000);
        h.add(5000);
        h.add(6000);
        System.out.println("printing the hash list-->");
        System.out.println(h);

        System.out.println("Class's result");
        Address s1=new Address("Manan","Officer");
        s1.toString();

        // now lets see some other java.util classes

        Date date= new Date();
        System.out.println("Time and date ---> "+date+"\n");

        // now currency class
        Currency c;
        c=Currency.getInstance(Locale.US);
        System.out.println("Symbol--> "+c.getSymbol());
        System.out.println("Value in digit--> "+c.getDefaultFractionDigits());
        System.out.println("Name of currency--> "+c.getDisplayName());
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------

/*
in this example we are learning that what is java lang purpose of using and what are it's classes and how they are used
and how to implement


 */

public class First
{
    public static void main(String[] args)
    {
        System.out.println("here we are using some of the classes under the java's lang\n");
        double theta=120.0;
        System.out.println("value in radian="+Math.toRadians(theta)+"\n");

        System.out.println("let see some other examples too\n");
        int num=19648;
        System.out.println("value in binary form="+Integer.toOctalString(num));

        // Example usage of java.lang.String class
        String str1 = "Hello";
        String str2 = "World";
        String concatStr = str1.concat(str2);
        System.out.println("Concatenated string: " + concatStr);
    }

}


----------------------------------------------------------------------------------------------------------------------------------------------------------

package com.company;
/*
# first java program basic information

 whenever we are creating any program in java we have to remember that program name should match with the class
 name we create in the program .
 for example we created a class Example then file named should be Example.java
  class Example
  {
   public static void main (String args[])        // class should call to main only
   {
    System.out.println("This is the first function");
   }
  }
 System.out.println(" " );  // this is used to print or display the output

 # Java Data types
   In java there are eight primitive types of data are present
   1.Byte  =  smallest data type with 8-bit type size
              ex :  byte a;
   2.Short =  it is signed 16 bit type , this is least used data type in java
              ex : short s;
   3.Int   =  most commonly used data type in java and it is signed as 32 bit type
              ex : int num;
   4.Long  =  signed as 64 bit type and it is occasionly used in place of int
              ex : long number;
   5.Char  =  it is used to store single character and it is 8 bit type
              ex :  char name;
   6.Float =  it is used to store single precision value and it is of 32 bit type
              ex : float n;
   7.double = it is used to store a value of 64 bit type and it is more faster than double
              ex : double pi;
   8.boolean = it is used to store logical values and it has only two values true/false
              ex : boolean b;

   # Operator
     These are symbol used to perform operation and manipulation on data , variable , constants and expression .
     Types of operator
     1. Assignment operator
     2. Relational operator
     3. Bitwise operator
     4. Logical bitwise operator

   # control statement
    1. if
    2. nested if
    3. if-elseif
    4. switch
    5. nested switch
    iteration statement
    6. while
    7. do while
    8. for
    9. for each
    10. nested loops
    11. break
    12. continue
    13. goto
    14. return

 */

import java.awt.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Hello manan\n");
        System.out.println("100");

        // let's learn or perform some data types example in java
        int a = 1, b = 2;
        byte z = 22;
        double pi = 3.14159;
        char X = 'M';
        System.out.println(a);
        System.out.println(z);
        System.out.println(pi);
        System.out.println(X);

        // let's perform some operation using operators
        int num1 = 10;
        int num2 = 20;
        System.out.println("The sum is " + (num1 + num2));
        System.out.println("The difference is " + (num1 - num2));
        System.out.println("The division is " + (num1 / num2));
        System.out.println("The multiplication is " + (num1 * num2));

        // let's perform some operations using control statements

        // if-else statement
        int num = 100;
        if (num <= 200)
        {
            System.out.println("This is the body of the if statement");
        }
        else
        {
            System.out.println("This is the body for the else statement of (if-else)");
        }

        // nested if statement
        int i = 10;
        int a1 = 2;
        int j = 19;
        int k = 50;
        int d = 12;
        int c = 0;
        if (i == 10)
        {
            if (j < 20)
            {
                a1 = b;
            }
            if (k > 100)
            {
                c = d;
            }
        }
        else
        {
            a1 = d;
            System.out.println(d);
        }

        // if-else if statement
        String name = "Manan";
        if (name.equals("Max"))
        {
            System.out.println("The name is not right");
        }
        else if (name.equals("Manan"))
        {
            System.out.println("The name is right " + name);
        }
        else
        {
            System.out.println("Please enter a valid name");
        }

        // switch statement
        for (k = 0; k < 3; k++)
        {
            switch (k)
            {
                case 0:
                    System.out.println("k is zero here");
                    break;
                case 1:
                    System.out.println("k is one here");
                    break;
                case 2:
                    System.out.println("k is two here");
                    break;
                default:
                    System.out.println("Here the value of k is exceeded");
            }
        }

        // while
        int n=10;
        while(n>0)
        {
            System.out.println("Tick-->"+n+"\n");
            n--;
        }

        // do while
        int p=5;
        do
        {
            System.out.println("the p is -->"+p);
            p--;
        }while(p>0);

        //for
        int q=5;
        for(q=5;q<=10;q++)
        {
            System.out.println("Optimas Prime"+"\n");
        }
       int arr[]={12,13,14,15,15,16};
       System.out.println("value of 1 is "+arr[1]+"\n");

       // now lets create a multi-dimensional array
        // Create a 2D array of integers
        int[][] matrix = new int[3][3];

        // Assign values to the elements
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // Print the elements of the array
        for (int i1 = 0; i1 < 3; i1++)
        {
            for (int j1 = 0; j1 < 3; j1++)
            {
                System.out.print(matrix[i1][j1] + " ");
            }
            System.out.println();
        }
        // by this we can access the element specifically
        System.out.println(matrix[2][1]);
        // here we are putting new value in the index
        matrix[2][0]=10;
        // here we are printing the new value of that index
        System.out.println(matrix[2][0]);

        // let's create strings
        String car[]={"FORD","MERCS","BMW","TATA"};
        for(int o=0;o< car.length;o++)
        {
            System.out.println("\t"+car[o]);
        }
        // let's make some new strings and then perform some operation on them
        String NAME1="Max";
        String NAME2="Payne";
        System.out.println("The name of the game was "+NAME1+NAME2);  // this show how to concatenate two strings and how to print them
        // let's see how to add string data type with other
        String s="Age : "+2+2;
        System.out.println(s);
        // for converting string we use toString() method
        int number = 42;
        String numberString = Integer.toString(number); // we have to do this as according to syntax
        /*
         syntax : String new_String_name=Data_type_of_converting_data.toString(variable_name);
         */
        System.out.println(numberString);

        // now lets see how to extract a string using charAt() method
        char ch;
        ch="abc".charAt(1);
        System.out.println(ch);
        // now lets see how to extract more characters at a time
        String s1="this is a demo line";
        int start =10;
        int end=14;
        char bu[]=new char[end-start];
        s1.getChars(start,end,bu,0);
        System.out.println(bu);

        // now lets learn how to compare two strings we use equal() method
        String b1="hi people";
        String b2="HI people";
        System.out.println(b1.equals(b2)); // as this is not same so it will show false otherwise if it's true then it shows true

        // let's learn how to get index or number of that element occur in  string's element
        String in="now its time for all the good mens to serve their country";
        System.out.println(in.indexOf('t'));


        // let's learn how to modify the string
        String originalString = "Hello, World!";

        // Concatenating strings
        String modifiedString1 = originalString + " Welcome!";
        System.out.println("Modified String 1: " + modifiedString1);

        //  Replacing characters
        String modifiedString2 = originalString.replace('o', '*');
        System.out.println("Modified String 2: " + modifiedString2);

        // Converting to uppercase
        String modifiedString3 = originalString.toUpperCase();
        System.out.println("Modified String 3: " + modifiedString3);

        // Trimming leading and trailing spaces
        String modifiedString4 = "   Trim Example   ".trim();
        System.out.println("Modified String 4: " + modifiedString4);

        // converting to uppercase
        String uppercaseString = originalString.toUpperCase();
        System.out.println("Uppercase String: " + uppercaseString);

        // Converting to lowercase
        String lowercaseString = originalString.toLowerCase();
        System.out.println("Lowercase String: " + lowercaseString);


        // let's learn about the string buffer peer class which allows to give functionality to strings
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Appending characters to the StringBuffer
        stringBuffer.append(", World!");
        System.out.println("After appending: " + stringBuffer);

        // Inserting characters at a specific position
        stringBuffer.insert(5, " there");
        System.out.println("After inserting: " + stringBuffer);

        // Replacing characters
        stringBuffer.replace(7, 12, "Java");
        System.out.println("After replacing: " + stringBuffer);

        // Deleting characters
        stringBuffer.delete(5, 11);
        System.out.println("After deleting: " + stringBuffer);

        // Reversing the StringBuffer
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);

        System.out.println("this is the result of using 'sout' instead of writing whole sentence");
        System.out.println("Lets learn how to get input from user ");
        Scanner num01 = new Scanner(System.in);
        System.out.println("Enter the value of number");
        int n1= num01.nextInt();
        System.out.println("The value of number is "+n1);

        Scanner Name=new Scanner(System.in);
        System.out.println("Enter name");
        String nm=Name.next();
        System.out.println("the name is "+nm);
    }
}

------------------------------------------------------------------------------------------------------------------------------------

package com.company;
// This is the interface declaration
interface Car {
    void details();
    void info();
}

// First class which connects to the interface using the 'implements' keyword
abstract class Mustang implements Car {
    @Override
    public void details() {
        System.out.println("Ford's Mustang is one of the best American cars, and its Shelby kit makes it a pure beast.");
    }
}

// Second class which extends from the first class
class Porsche extends Mustang {
    @Override
    public void info() {
        System.out.println("Ford started making this car in the early 60s, and its 1969 model became famous due to its looks and performance, making it popular in Hollywood movies like John Wick.");
    }
}

// Class which contains the main method
public class Max {
    public static void main(String[] args) {
        Porsche p1 = new Porsche();
        p1.details();
        p1.info();
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


package  ex;
// this will give a simple message for exception
public class demoexception
{
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 8;
        j = 0;
        try {
            k = i / j;
        } catch (Exception e)
        {
            System.out.println("can't be divide by zero , change the values for not getting any exception");
        }
        System.out.println(k);
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------

package ex;
// this will show that what's arthimetic exception is
public class demoexception3
{
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 8;
        j = 0;

        try {
            k = i / j;
        }
        catch (ArithmeticException e)
        {
            System.out.println("enter another number as it it not able to perfomr due to the wrong values");
        }
        System.out.println(k);
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------

    import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class first
{
    public static void main(String[] args)
    {

        // code to create a new file
        File f1=new File("firstfile.txt");
        try
        {
            f1.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println("unable to create this file\n");
            e.printStackTrace();
        }

        // code to write in file
        try {
            FileWriter fileWriter = new FileWriter("firstfile.txt");
            fileWriter.write("This is the first line which will be print in the file we create\n");
            fileWriter.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        // reading a file
        File firstfile =new File("firstfile.txt");
        try {
            Scanner sc = new Scanner(firstfile);
            while(sc.hasNextLine())
            {
                String line =sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }



    }
}
/*
note : if i remove the multi line commment the program will still run but the main problem will rise is that if i write
something in the file it will not appear as i created same file twice but since i do the commenting this will run and we
can see any information we store in that file
 */

---------------------------------------------------------------------------------------------------------------------------------------------------


