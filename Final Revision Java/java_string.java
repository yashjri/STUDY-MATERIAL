import java.util.Scanner;

public class java_string {
    public static void main(String[] args) {
        System.out.println("THIS IS STRING CODE");

        //create object of scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string for process :");
        //create object of string class
        String str=sc.nextLine(); //nextline or next use to get string input or next()

        System.out.println("The string user has entered is : "+str);

        //getting length of string
        int len=str.length();
        System.out.println("length of string : "+len); //this print the length which containts blank space

        //adding other data types in string
        int age=22;
        String detail= "His age is "+age+" and he lives in NYC";
        System.out.println(detail);

        //concaternation strings
        String s1= "MAX";
        String s2= "Payne";
        String s3= s1+s2;
        System.out.println(s3);

        //string conversion
        int num=100;
        String numstr=Integer.toString(num); // this will convert int to string and allow uss to use that int value as string value
        System.out.println("THe new string converted value is :"+numstr);

        //character extraction
        //1. CharAt()
        String ch="FORMAL";
        char chstr=ch.charAt(3); //syntax : object_String.charAt(index);
        System.out.println("Character extract from string is : "+chstr);

        //2. getChars()
        int start=10;
        int end=14;
        String s = "This is the line where i am defining a example";
        char[] sts;
        sts= new char[end-start];
        s.getChars(start, end, sts, 0); //corrected the end index to not include the character at end index
        System.out.println("Extracted string by index is :" + new String(sts));

        //comparing strings
        String sc1="BRAD";
        String sc2="brad";
        String sc3="BRAD";

        System.out.println("THe string are "+sc1.equals(sc2));
        System.out.println("THe string are "+sc1.equals(sc3));

        //replacing character in strings
        String wrong="WELLO";
        String right=wrong.replace('W', 'H');
        System.out.println("The string after updation is : "+right);

        //removing blank spaces
        String news= "HELLO WORLD";
        String NEWS=news.trim(); // this will remove the blank space before the H in string
        System.out.println("the string after removing blank spaces" + NEWS);


    }
}
