
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = 0;
        while (true){
            System.out.println("Give a number: ");
            int input = scanner.nextInt();
            if (input<0){
                nums+=1;
            }else if (input==0){
                System.out.println("Number of negative numbers: " + nums);
                break;
            }
        }
    }
}
