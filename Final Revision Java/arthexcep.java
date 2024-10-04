public class arthexcep {
    public static void main(String[] args) {
        //lets create a wrong code
        int a,b,c,d,e;
        a=10;
        b=5;
        c=5;
        try{
            d=a/(b-c);
            System.out.println("Value of D :" +d);
        }
        catch(ArithmeticException e1){
            System.out.println("Please enter right values again" +e1);
            e=a/(b-c);
            System.out.println("Value of e : "+e);
        }
    }
}
