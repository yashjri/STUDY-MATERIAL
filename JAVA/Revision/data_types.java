public class data_types {
    public static void main(String[] args) {
        int roll = 100;
        String name = "Yash";
        String section = "A";
        double marks = 90.22;
        char pass = 'T';

        System.out.println(roll);
        System.out.println(name);
        System.out.println(section);
        System.out.println(marks);
        System.out.println(pass);

        int age = 21;
        double height = 1.83;
        float pi = 3.14f;
        int ageIn5years = age + 5;
        double areaOfCircle = pi * Math.pow(height, 2);

        String greeting = "Hello " + name;

        System.out.println("My age in 5 years will be: " + ageIn5years);
        System.out.println("The area of a circle with my height as radius is: " + areaOfCircle);
        System.out.println(greeting);
    }
}