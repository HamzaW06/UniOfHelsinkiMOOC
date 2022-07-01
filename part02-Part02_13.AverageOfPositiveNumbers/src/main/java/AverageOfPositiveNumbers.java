
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = 0;
        int numTotal = 0;
        while (true){
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if (input == 0){
                if (numTotal == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println((double)numTotal/numCount);
                break;
            } else if (input>0){
                numTotal +=input;
                numCount +=1;
            }



        }
    }
}
