
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if (first>second){
            System.out.println(first + " is greater than " + second + ".");
        }else if (second>first){
            System.out.println(second + " is smaller than " + second + ".");
        } else{
            System.out.println(first + " is equal to " + second + ".");
        }
    }
}
