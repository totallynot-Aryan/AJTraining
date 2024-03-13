import java.util.ArrayList;

public class RevStr {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("World");
        al.add("!");
        System.out.println("Original List: "+al);

        //System.out.println("Reversed List: "+al.reversed()); //Pre-Defined Function

        int size=al.size();
        for(int i=0; i<=size/2; i++){
            String temp=al.get(i);
            al.set(i, al.get(size - 1 - i));
            al.set(size - 1 - i, temp);
        }
        System.out.println("Reversed List: "+al);
    }
}