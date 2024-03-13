import java.util.ArrayList;

public class EvenNoSum {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);


        int sum = 0;
        for (int num : al) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        /*
        int sum = 0;
        for(int i=0; i<al.size(); i++){
            if(al.get(i) % 2 == 0){
                sum+=al.get(i);
            }
        }
        */
        System.out.println("Sum of Even Numbers: "+sum);
    }
}