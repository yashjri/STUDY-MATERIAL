import java.util.ArrayList;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
//import java.util.Scanner;
//import java.lang.*;


public class tom
{
    public static void main(String[] args)
    {
        ArrayList<String> A1 = new ArrayList<String>();
        A1.add("Ferrari");
        A1.add("Lambo");
        A1.add("Porsche");
        System.out.println(A1.size());

        A1.remove("Porsche");
        System.out.println(A1.size());

        //------------X-----------X-----------

        HashSet<Integer> H1 = new HashSet<Integer>();
        H1.add(100);
        H1.add(200);
        H1.add(300);
        System.out.println(H1);

        //------------X-----------X-----------

        Currency c;
        c=Currency.getInstance(Locale.US);
        System.out.println("Name of currency : " + c.getDisplayName());
        System.out.println("Symbol" + c.getSymbol());


        //------------X-----------X-----------

        StringBuffer sb= new StringBuffer("Yash");
        int length = sb.length();
        System.out.println(length);

        //------------X-----------X-----------

        int capacity = sb.capacity();
        System.out.println(capacity);

        //------------X-----------X-----------

        sb.setLength(10);
        System.out.println(sb);

        //------------X-----------X-----------

         sb.append("Singh");
         System.out.println(sb);

        //------------X-----------X-----------

        sb.reverse();
        System.out.println(sb);

         //------------X-----------X-----------

         int i,j,k=0;
         i =8;
         j =2;

         try{
            k=i/j;
         }
         catch(ArithmeticException e)
         {
            System.out.println("Division by zero is not allowed");
         }
         System.out.println(k);
    }
}