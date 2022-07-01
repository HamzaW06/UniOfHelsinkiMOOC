
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        double sum = 0.0;

        while (true){
            int num = scanner.nextInt();
            if(num==-1){
                break;
            }

            list.add(num);
        }
        System.out.println("");

        for (Integer i: list){
            sum+=i;

        }
        System.out.println("Average: " + (sum/list.size()));


        
    }
}
