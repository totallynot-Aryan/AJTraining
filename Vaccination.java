import java.util.Scanner;

abstract class Vaccine {
    int age;
    String nationality;
    boolean isFirstDoseTaken;
    boolean isSecondDoseTaken;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
        this.isFirstDoseTaken = false;
        this.isSecondDoseTaken = false;
    }

    public void firstDose() {
        if (!isFirstDoseTaken && nationality.equalsIgnoreCase("Indian") && age >= 18) {
            isFirstDoseTaken = true;
            System.out.println("First Dose is applicable.");
            System.out.println("Please pay Rs.250 for the vaccination.");
        } else {
            System.out.println("Sorry! You're not eligible.");
        }
    }

    public void secondDose() {
        if (isFirstDoseTaken && !isSecondDoseTaken) {
            isSecondDoseTaken = true;
            System.out.println("Eligible for Second Dose.");
        } else if (!isFirstDoseTaken) {
            System.out.println("Ineligible, please take the First Dose!");
        } else {
            System.out.println("You're not eligible for Second Dose currently.");
        }
    }

    abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        if (isSecondDoseTaken) {
            System.out.println("Eligible for the Booster Dose. You can get vaccinated from your nearest Medical Camp.");
        } else if (!isFirstDoseTaken) {
            System.out.println("Ineligible, please take the First Dose!");
        } else {
            System.out.println("You're not eligible for Booster Dose currently.");
        }
    }
}

public class Vaccination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Nationality: ");
        String nationality = sc.next();

        System.out.println();

        VaccinationSuccessful vs = new VaccinationSuccessful(age, nationality);
        System.out.println("Scenario 1:");
        vs.firstDose();
        System.out.println("\nScenario 2:");
        vs.secondDose();
        System.out.println("\nScenario 3:");
        vs.boosterDose();
        sc.close();
    }
}