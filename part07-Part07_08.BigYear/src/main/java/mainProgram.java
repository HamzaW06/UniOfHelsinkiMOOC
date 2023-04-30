import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();

                database.addBird(name, latinName);
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();

                database.observeBird(name);
            } else if (command.equals("All")) {
                database.printAllBirds();
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();

                database.printOneBird(name);
            } else if (command.equals("Quit")) {
                break;
            } else {
                System.out.println("Incorrect input!");
            }
        }
    }
}