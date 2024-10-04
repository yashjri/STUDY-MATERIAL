import java.net.URL;
import java.net.MalformedURLException;

public class url {
    public static void main(String[]args)
    {
        try{
            URL ul=new URL("https://www.youtube.com/watch?v=3tE_FVG7KSY&t=638s");
            
            System.out.println("Protocol -->" +ul.getProtocol());
            System.out.println("Hostname -->" +ul.getHost());
            System.out.println("PortNo. -->" +ul.getPort());
            System.out.println("FileName -->" +ul.getFile());
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
    }    
}
