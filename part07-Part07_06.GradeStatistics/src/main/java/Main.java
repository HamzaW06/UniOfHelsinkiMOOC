import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoursePoint points = new CoursePoint();
        UserInterface ui = new UserInterface(scanner,points );

        ui.start();
        ui.prints(points);
    }
}