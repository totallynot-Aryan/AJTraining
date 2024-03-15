import java.util.HashSet;
import java.util.Set;

public class HashSetEleAppend {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(2);
        s.add(5);
        s.add(6);
        System.out.println("Original Set: "+s);

        s.add(9); //Element 9 appended at the end of the set.
        System.out.println("Updated Set: "+s);

    }
}