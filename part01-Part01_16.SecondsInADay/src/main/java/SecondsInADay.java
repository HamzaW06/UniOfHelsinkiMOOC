
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int secToDay = Integer.valueOf(scanner.nextLine());
        System.out.println(secToDay * 24 * 3600);

    }
}
