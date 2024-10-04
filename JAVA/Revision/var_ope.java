public class var_ope {
    public static void main(String[]args)
    {
        int num1=100;
        int num2=200;
        int sums=num2+num1;
        int mul=num2*num1;
        int div=num2/num1;
        int sub=num2-num1;
        System.out.println(sums);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(sub);

        String Fname="Yash";
        String Lname="Singh";
        String full_name=Fname+" "+Lname;
        System.out.println(full_name);

        int a=5;
        double b=3.14;
        char c= 'A';
        boolean istrue= true;
        String  text="Hello Java!";

        int sum=a+10;
        double product= b*2;
        int difference= a-3;
        double quotient= b/2;

        boolean isEqual =(a==5);
        boolean isNotEqual= (b !=2.0);
        boolean isGreater = (a > 3);
        boolean isLessOREqual = (b <= 3.14);

        boolean andResult=(istrue && isEqual);
        boolean orResult=(istrue || isGreater);
        boolean notResult= !istrue;

        System.out.println("Variable values:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("isTrue: " + istrue);
        System.out.println("Text: " + text);

        System.out.println("Arthematic operations");
        System.out.println("Sum: " + sum);
        System.out.println("Product:" + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);

        System.out.println("Comparision operations");
        System.out.println("isEqual: " + isEqual);
        System.out.println("isNotEqual:" + isNotEqual);
        System.out.println("isLessOREqual: " + isLessOREqual);
        System.out.println("isGreater: " + isGreater);

        System.out.println("Logical operations");
        System.out.println("andResult: " + andResult);
        System.out.println("orResult:" + orResult);
        System.out.println("notResult: " + notResult);

    }
}
