
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                System.out.println(total);
                break;

            }else{
                total ++;
            }
        }
    }
}
