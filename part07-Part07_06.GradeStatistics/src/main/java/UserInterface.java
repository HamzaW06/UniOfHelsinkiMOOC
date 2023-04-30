import java.util.Scanner;


public class UserInterface {

    private Scanner scanner;
    private CoursePoint coursePoint;

    public UserInterface(Scanner scanner, CoursePoint coursePoint) {
        this.scanner = scanner;
        this.coursePoint = coursePoint;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {

            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            coursePoint.add(input);

        }

    }

    public static String noNumberPrint(double avPass) {
        if (avPass == -1) {
            return "-";
        }
        return String.valueOf(avPass);
    }

    public static void prints(CoursePoint coursePoint) {
        System.out.println("Point average (all): " + coursePoint.average());
        System.out.println("Point average (passing): " + noNumberPrint(coursePoint.averagePassingGrade()));
        System.out.println("Pass percentage: " + coursePoint.passPercent());
        printGradeDistibution(coursePoint);
    }

    public static void printGradeDistibution(CoursePoint coursePoint){
        System.out.println("Grade distribution:");
        coursePoint.printGrades(coursePoint.gradeDistribuition());
    }
}
