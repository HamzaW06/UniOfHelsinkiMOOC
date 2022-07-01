
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fReq = scanner.nextLine();
        try (Scanner sc = new Scanner(Paths.get(fReq))){
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}
