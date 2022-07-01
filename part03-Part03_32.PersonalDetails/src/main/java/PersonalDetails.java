
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String longestName = "";
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                System.out.println("Longest name: " + longestName);
                System.out.println("Average of birth years: " + ((double) sum / count));
                break;
            }
            String[] pieces = input.split(",");
            if (pieces[0].length() > longestName.length()){
                longestName = pieces[0];

            }
            count += 1;
            sum += Integer.valueOf(pieces[1]);
        }

    }
}
