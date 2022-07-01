
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        try (Scanner scanFile = new Scanner(Paths.get(file))){
            int gameCount = 0;
            int winCount = 0;
            int lossCount = 0;

            String[] parts;

            while (scanFile.hasNextLine()){
                String line = scanFile.nextLine();
                parts = line.split(",");
                if (parts[0].equals(teamName)) {
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        winCount++;
                    } else {
                        lossCount++;

                    }
                    gameCount ++;
                }

                if (parts[1].equals(teamName)){
                    if (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])){
                        winCount ++;
                    }else{
                        lossCount++;
                    }
                    gameCount++;
                }
            }
            System.out.println("Games: " + gameCount );
            System.out.println("Wins: " + winCount);
            System.out.println("Losses: " + lossCount);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
