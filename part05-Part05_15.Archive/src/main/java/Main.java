
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figure> figures = new ArrayList<>();
        while (true){
            System.out.println("Identifier? (empty will stop)");
            String ID = scanner.nextLine();
            if (ID.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            Figure temp = new Figure(ID,name);
            if (!(figures.contains(temp))){
                figures.add(temp);
            }



        }
        System.out.println("==Items==");
        figures.forEach(System.out::println);

    }
}
