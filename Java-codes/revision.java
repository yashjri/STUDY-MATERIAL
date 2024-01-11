import java.util.Arrays;
public class revision 
{
    public static int  trial()
    {
        System.out.println("The value is called by the function ");
        return 100;
    }
    public static void main(String[] args)
    {
     // data types
     // byte - take 1 bytes [-128 to 127] 
     // int - takes 4 bytes 
     // float- takes 4 bytes
     // long - takes 8 bytes 
     // double - takes 8 bytes  
     // char - takes 1 bytes 
     // Boolean - takes 1 bytes

     // Variable
     // for declaring a variable we need to declare with it's type and value
     
     // Operator 
     // use for performing operation on the operands using the operator like +,*,/,%,- etc

     String name="Manan";
     System.out.println("the value of string is "+name);

     int m1=100;
     int m2=200;
     
     int sum=m1+m2;
     int div=m1/m2;
     int mul=m1*m2;
     int sub=m1-m2;

     System.out.println("Addition :"+sum);
     System.out.println("Multiplication :"+mul);
     System.out.println("Divison :"+div);
     System.out.println("Subtraction :"+sub);

     // String 
     String f="Manan";
     String s="Chawla";
     String full=f+ s;
     System.out.println("Full name is "+full);
     
     // we can extract the string at any specific position using charAt
     String car="LAMBORGHII";
     System.out.println(car.charAt(5));

     // we can also get length of any string using the length 
     System.out.println(car.length());

     // we can replace string also using the replace 
     String car2=car.replace('L','F');
     System.out.println(car2);

     // there is another which is used for extracting the string 
     String car3="Mazda CX";
     System.out.println(car3.substring(6, 8));

     // Arrays
     // syntax -->  data_type[] array_name=new data_type[];
     int[] marks = new int[5];
     marks[0]=10;
     marks[1]=20;
     marks[2]=30;
     marks[3]=50;
     marks[4]=40;
     for(int i =0;i<5;i++)
     {
     System.out.println("Array-->"+marks[i]);
     }

     // for getting length of the array
     System.out.println(marks.length);

     // for sorting the array
     Arrays.sort(marks);
     for(int i =0;i<5;i++)
     {
     System.out.println(marks[i]);
     }

     // another way of declaring the arrays
     int car_Rate[]={100,200,300,400};
     for(int i=0;i<4;i++)
     {
        System.out.println("Rate of car-->"+car_Rate[i]);
     }

     int result;
     result=trial();
     System.out.println(result);

     // casting
        double Price=10000;
        double Final_price=Price+20000;
        System.out.println("Price is -->"+Final_price);

     // Explict casting
        int p=120;
        int fp = p+(int)14.5;
        System.out.println("Explict casting value is : "+fp);
    }
}
