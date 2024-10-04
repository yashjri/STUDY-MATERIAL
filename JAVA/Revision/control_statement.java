import java.util.Scanner;

public class control_statement {
    public static void main(String[] args)
    {
        //control statement
        //if-else statement
        int number = 10;
        if(number > 0)
        {
            System.out.println("The number is positive");
        }
        else if (number < 0)
        {
            System.out.println("The number is negetive");
        }
        else{
            System.out.println("The number is zero");
        }

        //Switch-case statement
        char grade='B';
        switch(grade)
        {
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("good job");
                break;
            case 'C':
                System.out.println("satisfactory");
                break;
            default:
                System.out.println("needs improvement");
        }

        //while loop
        int i=1;
        System.out.println("WHILE LOOP");
        while(i <= 5)
        {
            System.out.println("Iteration" + i);
            i++;
        }

        //do-while loop
        i=1;
        System.out.println("DO-WHILE LOOP");
        do {
            System.out.println("Iteration" + i);
            i++;
        }while (i<=5);

        //for-loop
        System.out.println("FOR LOOP");
        for (int j=1; j<=5; j++)
        {
            System.out.println("iteration" + j);
        }

        //enchanced for-loop(for-each loop)
        System.out.println("ENHANCED FOR LOOP(ARRAY ITERATION)");
        int[] numbersArray={1,2,3,4,5};
        for (int num: numbersArray)
        {
            System.out.println(num);
        }

        //break and continue
        System.out.println("BREAK AND CONTINUE IN FOR LOOP");
        for (int k=1; k<=10; k++)
        {
            if(k==5)
            {
                System.out.println("Breaking the loop at iteration 5.");
                break;
            }
            if(k % 2==0)
            {
                System.out.println("Skipping even iteration: " + k);
                continue;
            }
            System.out.println("Iteration" + k);
        }

        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.println("Enter 'exit' to stop the loop");
        do {
            System.out.println("Enter something");
            userInput= scanner.nextLine();
            System.out.println("You entered:" + userInput);
        }while (!userInput.equalsIgnoreCase("exit"));
        scanner.close();
    }
}
