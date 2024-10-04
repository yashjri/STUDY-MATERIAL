public class Exception1 {
    public static void main(String[] args)
    {
        try 
        {
            int[] numbers={1,2,3};
            int element=numbers[3]; //accessing an out of bounds index
            System.out.println("Element:"+element);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException:"+e.getMessage());
        }
    }
}
