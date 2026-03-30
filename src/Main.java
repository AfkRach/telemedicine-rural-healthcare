import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("  TELEMEDICINE SYSTEM (RURAL CARE) ");
        System.out.println("===================================");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Symptoms");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("\nEnter your symptoms: ");
                String symptoms = sc.nextLine();

                String result = TriageModule.process(symptoms);

                System.out.println("\n--- Result ---");
                System.out.println(result);

            } else if (choice == 2) {
                System.out.println("Exiting system. Stay healthy!");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
