
public class day01 {
    public static void main(String[] args) {
        System.out.println("Hello world, i am a chess player");
        //data types : it refers to a type which a variable can store data or information in it
        // each data type have its own value and properties 

        int a=10;
        char words = 'A';
        String name = "Yash Singh";

        System.out.println("INTEGER :" +a);
        System.out.println("CHARACTER :" +words);
        System.out.println("STRING :" +name);

        //operators and some operations
        int num1=100, num2=200;
        int sum,sub,mul;
        int div;
        //arthimatic operator
        sum=num1+num2;
        sub=num1-num2;
        mul=num1*num2;
        div=num2/num1;
        System.out.println("SUM :"+sum);
        System.out.println("MUL :"+sum);
        System.out.println("SUB :"+sum);
        System.out.println("DIV :"+sum);

        //comparison operator
        if (num1>num2) {
            System.out.println("right dude");
        }
        else{
            System.out.println("Wrong dude");
        }
    }
}
