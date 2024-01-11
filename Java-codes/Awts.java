import java.awt.*;
import java.lang.*;
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

public class  Awts {
    public static void main(String [] args)
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
      System.out.println("MANAN CHAWLA IS THE BEST PERSON IN THE WORLD");
       ArrayList<String> a1 = new ArrayList<String>();
        a1.add("M");
        a1.add("A");
        a1.add("N");
        a1.add("A");
        a1.add("N");
        System.out.println(a1+"\n");
        a1.add("Chawla");
        System.out.println("Now the value of array is -->"+a1+"\n");
        // now lets remove the array's elemeny using it's index
        a1.remove(5);
        // now let's see our new and updated array
        System.out.println("New and updated array-->\n"+a1);
    }
}
