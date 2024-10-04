import java.lang.StringBuffer;
public class unit1
{
    static int sr_no=20;  // class scope or static variables
    // this is the method 
    public static void main(String[] args) 
    {
      // four data types
      /*
        INTEGER    int short long byte
        CHAR       'char'
        BOOLEAN     0 or 1 // true or false
        FLOAT       float and double 
        STRING      " "
        STRINGBUFFER    " "  // here we use StringBuffer as a keyword to declare it
      */  
      int roll=100;
      System.out.println("This is your roll number : "+roll);

      long pincode=302013;
      System.out.println("Your pincode is : "+pincode); 

      String name="Manan";
      System.out.println("Your name is : "+name);

      StringBuffer sb= new StringBuffer("This is the line create using the stringbuffer ");
      System.out.println(sb);

      char Section='C';
      System.out.println(Section);

      Float percentage=(float) 89.9;
      System.out.println(percentage);


      // Major four types of operator
      /* 
       * Arithmetic operator     +  -  *  /  % 
       * Logical operator        & ||  !
       * Relational operator     > < = ==  !  !=  
       * Bitwise operator        >>  <<  <<<   >>>  
       */

       int a=10;
       int b=20;
       int sum,mul,div,sub;
       sum=a+b;
       mul=a*b;   // multiplication
       div=a/b;
       sub=a-b;
       System.out.println(sum);
       System.out.println(mul);
       System.out.println(div);
       System.out.println(sub);


       /*
        *  Statement in java 
          if-statement
          if-else 
          switch
          ladder-if

          for
          while
          do-while
          for-each (enhanced for loop)

          break
          countine
          return
          go-to       // it can't be use in java
        */

        if(a==10)
        {
            System.out.println("Yes it is the number we want");
            if(a==10)
            {
                System.out.println("BCA");
            }
        }
        else
        {
            System.out.println("No this is not the number we want");
        }

        switch (Section) 
        {
            case 'A':
                System.out.println("No its not our section");
                break;
            
                case 'B':
                System.out.println("still its not our section");
                break;

                case 'C':
                System.out.println("Its our section");
                break;
            default:
                System.out.println("This is not the section list");
                break;
        }


        for(int i=0;i<5;i++)
        {
            System.out.println("BCA");
        }
 
        // why it is so important static ?
        int marks=100;
        do
        {
            System.out.println("i got full marks");
        }while(marks==990);

        System.out.println(sr_no);

        int[] arr={12,13,14,15};
        for(int str_arr : arr)
        {
            System.out.println(str_arr);
        }
    }
}