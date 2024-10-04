public class strings_in_java {
    public static void main(String[] args)
    {
        StringBuilder sb= new StringBuilder("Yash");
        System.out.println("Name created by StringBuilder is-->"+sb);

        //character at index 0
        System.out.println("Character Placed at index 0 -->"+sb.charAt(0));

        //set character at index 0
        sb.setCharAt(0, 'N');
        System.out.println("New String is -->"+sb);

        //inserting using insert
        sb.insert(0, 'M' );
        System.out.println("New string again after inserting-->" +sb);

        //replacing using replace method
        sb.replace(0, 5, "Yash");
        System.out.println("string after replacing the previous string -->"+sb);

        //deleting the character at any specific position
        sb.delete(0, 5);
        System.out.println("Deleted string -->"+sb); //string is completely deleted

        //appending string 
        sb.append("Yash_Singh");
        System.out.println("String after deletion-->"+sb);

        //array creation using the string array method
        String str[]={"Car","Planes","Truck","Tank","Helicopter","Submarine"};

        for(int i=0; i<str.length; i++)
        {
            System.out.println("Array -->"+str[i]);
        }
    }
}
