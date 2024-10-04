

public class d01 
{
     static int x = 10;
    /**
     * @param args
     */
    public   static void main(String[]args)
{
 int a=10;
 System.out.println("Value of a is : "+a);
 float f=(float) 90.0;
 System.out.println(f);
 
 System.out.println("value of x "+x);

 

 int arr[]=new int[5];
 arr[0]=100;
arr[1]=200; 
arr[2]=300;
arr[3]=400;
arr[4]=500;
for(int i=0;i<5;i++)
{
    System.out.println(arr[i]);
}

String walking = "hlo";
String footpath = "hlo";
System.out.println(walking.length());
System.out.println(footpath.length());
String nisha=walking+footpath;
System.out.println(nisha);

String num=Integer.toString(a);
System.out.println(num);
System.out.println(walking.equals(footpath));

StringBuffer sb= new StringBuffer("NISHA ");
int cap=sb.capacity();
System.out.println(cap);
sb.setLength(10);
System.out.println(sb);
sb.append("WEDS YASH");
System.out.println(sb);
sb.reverse();
System.out.println(sb);
String sub=sb.substring(5);
System.out.println(sub);
}


}
