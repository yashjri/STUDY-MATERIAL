class first
{
    int roll;
    public void person(int roll)
    {
        this.roll=roll;
    }
    public void display()
    {
        System.out.println("this is roll number : "+ roll);
    }
}

public class classes {
  public static void main(String[] args) {
    first f1=new first();
    f1.person(100);
    f1.display();
  }
}
