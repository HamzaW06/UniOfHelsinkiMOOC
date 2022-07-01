
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = 0;
        int numTotal = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            numTotal += input;
            if (input == 0) {
                System.out.println("Average of the numbers: " + ((double)numTotal/numCount));
                break;
            }
            numCount += 1;
        }
    }
}
