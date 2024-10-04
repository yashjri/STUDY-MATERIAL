// call by reference 
class GET
{
    int value;
    GET(int value)
    {
        this.value=value;
    }
}
class First
{
    public void SQ(GET ele)
    {
        ele.value=ele.value*ele.value;
        System.out.println("Square of number :");
        System.out.println(ele.value);
    }
}
public class f4 {
    public static void main(String[] args) {
        GET number = new GET(5);
        First f1=new First();
        System.out.println("Value before : "+number.value);

        f1.SQ(number);
        System.out.println("After value :"+number.value);
    }
}
