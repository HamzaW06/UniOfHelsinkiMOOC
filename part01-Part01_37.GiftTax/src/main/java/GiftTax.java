
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double input = Double.valueOf(scan.nextLine());

        double tax1 = (100+ (input-5000) * .08);
        double tax2 = (1700+ (input-25000) * .10);
        double tax3 = (4700+ (input-55000) * .12);
        double tax4 = (22100+ (input-200000) * .15);
        double tax5 = (142100+ (input-1000000) * .17);

        if (input<5000){
            System.out.println("No tax!");
        } else if(input >=5000 && input<25000){
            System.out.println("Tax: " + tax1);
        } else if(input>=25000 && input<55000){
            System.out.println("Tax: " + tax2);
        } else if(input>=55000 && input<200000){
            System.out.println("Tax: " + tax3);
        } else if(input>=200000 && input<1000000){
            System.out.println("Tax: " + tax4);
        } else if(input>=1000000){
            System.out.println("Tax: " + tax5);
        }
    }
}
