import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.Scanner;

public class pack {
    public static void main(String[]args)
    {
        ArrayList<Integer> numberlist= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //populate the arraylist with user input
        System.out.println("Enter a series of integers(enter a non-integer to stop):");
        while(scanner.hasNextInt())
        {
            int number = scanner.nextInt();
            numberlist.add(number);
        }
        System.out.println("Contents of the arraylist:");
        for(int num: numberlist)
        {
            System.out.println(num + " ");
        }
        System.out.println();

        int sum=0;
        for(int num: numberlist)
        {
            sum += num;
        }
        System.out.println("Sum of the numbers: "+sum);
        //
        //
        //
        //
        //Create a Hashmap to store words -
        Map<String,String> dictionary= new HashMap<>();
        dictionary.put("apple", "a fruit that grows on tree");
        dictionary.put("computer", "an electronic device for processing data");
        dictionary.put("book", "a written or printed work consisting of pages");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word to loop up to its meaning:");
        String word= sc.nextLine();
        if(dictionary.containsKey(word))
        {
            String meaning =dictionary.get(word);
            System.out.println("Meaning of "+word+":"+meaning);
        }
        else{
            System.out.println("Word not found in the dictionary.");
        }

        //Linkedlist
        LinkedList<String> toDoList= new LinkedList<>();
        Scanner s = new Scanner(System.in);
        String task;
        while(true)
        {
            System.out.println("enter a task(or 'quit' to exit):");
            task = s.nextLine();

            if(task.equals("quit"))
            {
                break;
            }
            toDoList.add(task);
        }

        System.out.println("TO-DO-LIST:");
        for(String item: toDoList)
        {
            System.out.println(item);
        }
        s.close();
        scanner.close();
        sc.close();
    }
}
