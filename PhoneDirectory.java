import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> mp = new HashMap<>(); // Create a HashMap to store name-number pairs

        System.out.println("Phone Directory");
        while (true) {
            System.out.println("=================");
            System.out.println("1. Find number");
            System.out.println("2. Add number");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt(); // Read user's choice

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");

                    sc.nextLine(); // Consume newline character

                    String nameToFind = sc.nextLine(); // Read name to find

                    // Find the phone number associated with the name
                    String phoneNumber = mp.get(nameToFind);
                    if (phoneNumber != null) {
                        System.out.println("Phone number for " + nameToFind + " is " + phoneNumber);
                    } else {
                        System.out.println("No phone number found for " + nameToFind);
                    }
                    break;
                case 2:
                    System.out.print("Enter name: ");

                    sc.nextLine(); // Consume newline character

                    String name = sc.nextLine(); // Read name
                    System.out.print("Enter phone number: ");
                    String newPhoneNumber = sc.nextLine(); // Read phone number
                    mp.put(name, newPhoneNumber); // Add the name-number pair to the map
                    System.out.println("Added "+name+" to phone book");
                    break;
                case 3:
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
