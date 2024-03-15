import java.util.HashMap;

public class HashMapEmptyCheck {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        //hm.put(101,"A");
        //hm.put(102,"B");
        //hm.put(103,"C");

        if(hm.isEmpty()){
            System.out.println("HashMap is EMPTY!");
        } else{
            System.out.println("HashMap is not empty, it contains some values:");
            System.out.println(hm);
        }
    }
}
