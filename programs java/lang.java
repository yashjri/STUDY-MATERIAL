public class lang {

    public static long fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args)
    {
        int n=5;
        long factorial=fact(n);
        System.out.println("Factorial of number--->"+factorial);

        int[] num={100,200,300,400,500};
        for(int nums:num)
        {
            System.out.println("Element--->"+nums);
        }

        char ucase='Y';
        char lcase=Character.toLowerCase(ucase);
        System.out.println("Lower case--->"+lcase);
    }
}
