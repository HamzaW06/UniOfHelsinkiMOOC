
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = 0;
        while (true){
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            nums +=input;
            if (input == 0){
                System.out.println("Sum of the numbers: " + nums);
                break;
            }
        }
    }
}
