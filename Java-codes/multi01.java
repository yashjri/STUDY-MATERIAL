 import javax.management.RuntimeErrorException;

public class multi01 implements Runnable
{
    public int threadnum;
    public multi01(int threadnum)   
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
            multi01 m2=new multi01(i);
            Thread t1 = new Thread(multi01);
        }
        throw new RuntimeException();
    }
} 

