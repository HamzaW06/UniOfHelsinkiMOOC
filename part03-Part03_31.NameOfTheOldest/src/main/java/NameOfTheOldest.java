
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        while(true){
            String userInput = scanner.nextLine();
            if (userInput.equals("")){
                System.out.println("Name of the oldest: " + oldestName);
                break;
            }
            String[] pieces = userInput.split(",");
            if (Integer.valueOf(pieces[1]) > oldest){
                oldest = Integer.valueOf(pieces[1]);
                oldestName = pieces[0];
            }
        }


    }
}
