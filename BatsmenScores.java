import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BatsmenScores {
    public static void main(String[] args) {
        HashMap<String, Integer> score = new HashMap<>();
        score.put("Kohli", 100);
        score.put("Dhoni", 120);
        score.put("Tendulkar", 150);
        score.put("Pandya", 80);
        score.put("Gill", 60);

        System.out.println("=====================");
        System.out.println("Batsmen are: ");
        for (Map.Entry<String, Integer> entry : score.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println("=====================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of Batsman: ");
        String bname = sc.nextLine();

        if (score.containsKey(bname)) {
            int scr = score.get(bname);
            System.out.println(bname + "'s score is " + scr);
        } else {
            System.out.println("Batsman " + bname + " is not found in the records.");
        }
    }
}
