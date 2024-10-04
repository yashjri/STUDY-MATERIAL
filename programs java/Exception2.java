public class Exception2 {
    public static void main(String[] args)
    {
        try{
            int result=10/0; //attempt to divide by zero
            System.out.println("Result:" +result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException:"+e.getMessage());
        }
        finally{
            System.out.println("This block always execute,even if an exception occurs.");
        }
    }
}
