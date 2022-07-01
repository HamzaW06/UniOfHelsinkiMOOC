
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numCount = 0;
        double avg = 0.0;
        int eCount = 0;
        int oCount = 0;
        int input = 0;
        System.out.println("Give numbers:");
        while (input != -1){
            input = scanner.nextInt();
            if (input > 0){
                sum += input;
                numCount ++;
                if (input %2 == 0){
                    eCount ++;
                }else{
                    oCount ++;
                }

            }
        }
        avg = (1.0) * (sum) / numCount;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+ sum);
        System.out.println("Numbers: "+ numCount);
        System.out.println("Average: " + avg);
        System.out.println("Even: "+ eCount);
        System.out.println("Odd: "+ oCount);

    }
}
