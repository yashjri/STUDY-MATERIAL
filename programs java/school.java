import java.util.Scanner;

class Student {
    int roll;
    String name;

    void get() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Roll:");
        roll = SC.nextInt();
        SC.nextLine(); // Consume the newline character left in the buffer
        System.out.println("Enter Name:");
        name = SC.nextLine();
        SC.close();
    }

    void show() {
        System.out.println("Roll no:" + roll);
        System.out.println("Name:" + name);
    }
}

class Parent extends Student {
    String Pname;
    String Mname;

    void gets() {
        super.get(); // Call the get method from the parent class
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your father's name:");
        Pname = S.nextLine();
        System.out.println("Enter your mother's name:");
        Mname = S.nextLine();
        S.close();
    }

    void display() {
        super.show();
        System.out.println("Father's name:" + Pname);
        System.out.println("Mother's name:" + Mname);
    }
}

public class school {
    public static void main(String[] args) {
        Parent P1 = new Parent();
        P1.gets();
        P1.display();
    }
}