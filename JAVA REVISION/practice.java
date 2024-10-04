public class practice {
    long code=302039; // instance variable
    static int Codes= 100; // class scope of static variable

    public static void main(String[] args) {
        int r;
        r=100;
        System.out.println("Your roll number is"+ r);

        String name ="Yash";
        System.out.println("Your name is "+ name);

        float percentage=(float) 80.0;
        System.out.println("your final year percentage is" + percentage);

        System.out.println("Subjects include in final year-->");
        String[] subject = new String[6]; // create a array of string
        subject[0]="Java";
        subject[1]="e commerce";
        subject[2]="Network";
        subject[3]="DSA";
        subject[4]="SDC";
        subject[5]="PHP";

        for(int i=0; i<6; i++)
        {
            System.out.println(subject[i]); // print array
        }

        String f_name="Yash";
        String l_name="Singh";
        String full_name = f_name+l_name; // concatenation 
        System.out.println("Full name : "+full_name);

        practice karo = new practice(); // we have to create a instance of that instance variable
        System.out.println("The pincode of residence is : "+ practice.Codes);
        System.out.println("Your code is:" + Codes);

        String car="BMW";
        if(car=="BMW")
        {
            System.out.println("You have good car");
        }
        else
        {
            System.out.println("Bad car");
        }

        char chess='M';
        switch (chess) {
            case 'A':
                System.out.println("Magnus carlsen");
                break;
            case 'H':
            System.out.println("Hikaru nakamura");
                break;

            case 'F':
            System.out.println("Fabiano caruana");

            default:
            System.out.println("NO chess player");
                break;
        }
        int m=10;
        do{
            System.out.println("Lucky number");
        }while(m==9);

        int i = 1;
        System.out.println("While loop");
        while (i <= 5) {
            System.out.println("Iteration" + i);
            i++;
        }

        //enhanced for loop(for each loop)
        System.out.println("FOR LOOP(ARRAY ITERATION");
        int[] numbersarray={1,2,3,4,5};
        for(int num : numbersarray)
        {
            System.out.println(num);
        }
    }
}
