import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapValueSearch {
    public static void main(String[] args) {
        // Create a TreeMap to store names as keys and ages as values
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Brian", 32);
        tm.put("Dominic", 38);
        tm.put("Hobbs", 45);
        tm.put("Shaw", 42);
        tm.put("Han", 30);

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        // Flag to check if a name with the entered age is found
        boolean found = false;
        // Iterate through the entries of the TreeMap
        for(Map.Entry<String, Integer> mentry : tm.entrySet()){
            // Check if the age matches the entered age
            if(mentry.getValue() == age){
                // If a match is found, print the name associated with the age
                System.out.println("Name with age "+ age +" is: "+ mentry.getKey());
                found = true;
            }
        }
        // If no match is found, print a message
        if(!found){
            System.out.println("No name was found with the entered age!");
        }
    }
}
