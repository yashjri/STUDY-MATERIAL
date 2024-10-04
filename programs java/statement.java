public class statement {
    public static void main(String[]args)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("I have got no roots");
        }

        int x=0;
        while(x<5)
        {
            System.out.println(x);
            x++;
        }

        int y=0;
        do{
            System.out.println(y);
        }while(y<5);

        int number=10;
        if(number>5)
        {
            System.out.println("Number is greater than 5");
        }

        int age=18;
        if(age>=18)
        {
            System.out.println("Vote");
        }
        else{
            System.out.println("No vote");
        }

        int day=2;
        switch(day)
        {
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            default:System.out.println("Invalid day");
        }

        for(int i=0;i<5;i++)
        {
            if(i==3)
            {
                break;
            }
            System.out.println(i);
        }

        for(int i=0; i<5;i++)
        {
            if(i==2)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
