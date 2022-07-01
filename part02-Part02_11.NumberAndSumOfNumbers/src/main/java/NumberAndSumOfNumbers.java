
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = 0;
        int numTotal = 0;
        while (true){
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            numTotal += input;
            if (input==0){
                System.out.println("Number of numbers: " + numCount);
                System.out.println("Sum of the numbers: " + numTotal);
                break;
            }
            numCount+=1;
        }
    }
}
