public class day03 {
 public static void main(String[] args) {
    //string buffer is the peer class of strings & its also a part of java.lang package
    //the major difference is that it can grow and writeable character sequence
    StringBuffer sb=new StringBuffer("HELLO IM YASH");
    System.out.println("THe value of stringbuffer is :"+sb);

    //to get length of the string buffer
    int len=sb.length();
    System.out.println("the length of string buffer is :"+len);

    //capacity : its the number allocated as a character
    //default capacity of string is always 16 and the number of character add in this to get total capacity

    int cap=sb.capacity();
    System.out.println("The capacity of string buffer is :"+cap);

    //for defining length of string buffer we use .setlength()
    StringBuffer s1= new StringBuffer("HELLO world");
    s1.setLength(11);
    System.out.println("THe length of string buffer : "+s1);

    //for adding 2 string or appending we use append
    sb.append("we, are humans");
    System.out.println("the string buffer after appending is : "+sb);

    //for reversing the character we use reverse() function
    s1.reverse();
    System.out.println("the reverse string buffer is : "+s1);

    //to get substring buffer
    String sub=s1.substring(6);
    System.out.println("sub string buffer value is :"+sub);
 }   
}
