import java.util.HashMap;
import java.util.Map;

public class hashs {
    public static void main(String[] args)
    {
        String input = "CR7";
        int hashcode=input.hashCode();
        System.out.println("Hash code of "+input+":"+hashcode);
        Map<String, Integer> hashMap=new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        System.out.println("value associated with two: "+hashMap);
        boolean containsKey= hashMap.containsKey("four");
        System.out.println("four exists in the hash table:"+containsKey);
    }
}
