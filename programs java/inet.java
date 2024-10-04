import java.net.InetAddress;
import java.net.UnknownHostException;
public class inet
{
    public static void main(String[]args) throws UnknownHostException
    {
        try
        {
        InetAddress ad=InetAddress.getLocalHost();
        System.out.println("localhost-->"+ad.getHostAddress());
        System.out.println("localhost name-->"+ad.getHostName());


        InetAddress rm=InetAddress.getByName("www.linkedin.com");
        System.out.println("Remote host-->"+rm.getHostAddress());
// System.out.println(ad);
        }
        catch(UnknownHostException e)
        {
          e.printStackTrace();
        }
        
    }
}