public class unit2 {
    public static void main(String[] args) 
    {
      /*
       String : Array of character or sequence of character
                It is not mutable.
        There are various operation we can perfrom on the string:
        A. declaration
        B. Modifying the value
        C. Concatenation
        D. Length
        E. Changing case
        F. Compare
        G. Getting the index of character
      
      */  

      String s1="Ford";
      String s2="Mustang";

      s2="Raptor";
      String s3=s1+s2;
      System.out.println(s3.length());
      String s4="TaTA";
      System.out.println(s4.toUpperCase());
      String s5="TESLA";
      System.out.println(s5.toLowerCase());

      //System.out.println(s1.compareTo(s2));
      String f="CAR";
      String c="CAR";
      boolean Computer= f.equals(c);
      System.out.println(Computer);

      String in="This is the string";
      System.out.println(in.charAt(9));



      /*
       * Array :  collection of similar data types 
       * there are two types of array
       * A. Linear or one or single
       * B. Multi or Two or Matrix
       */

       int[] arr=new int[5];
       arr[0]=100;
       arr[1]=200;
       arr[2]=300;
       arr[3]=400;
       arr[4]=500;

       for(int i=0;i<5;i++)
       {
        System.out.println("Elements---> "+arr[i]);
       }

       
    int[][] twoarr =new int[2][2];
    twoarr[0][1]=10;
    twoarr[0][1]=20;
    twoarr[1][0]=30;
    twoarr[1][1]=40;

    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            System.out.println(twoarr[i][j]);
        }
    }

    }
}