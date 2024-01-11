import javax.management.RuntimeErrorException;

public class multi extends Thread
{
    public int threadnum;
    public multi(int threadnum)   
    {
        this.threadnum=threadnum;
    }
    @override
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
           System.out.println(i+" from thread "+threadnum);
           if(threadnum ==3)
           {
            throw new RuntimeException();
           }
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {

        }
    }
    public static void main(String[] args)
    {
        for(int i=0;i<3;i++)
        {
        multi m1=new multi(i);
        m1.start();
        }
        throw new RuntimeException();
    }
}