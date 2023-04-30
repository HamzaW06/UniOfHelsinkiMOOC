import java.util.ArrayList;

public class CoursePoint {

    private ArrayList<Integer> points;

    public CoursePoint() {
        this.points = new ArrayList<>();
    }

    public void add(int number) {
        if (checkRange(number)) {
            points.add(number);
        }
    }

    public boolean checkRange(int number) {
        if (number >= 0 && number <= 100) {
            return true;
        }
        return false;
    }

    public int sum() {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return sum;
    }

    public int sumPassed() {
        int sum = 0;
        for (int point : points) {
            if (isMoreThanFifty(point)) {
                sum += point;
            }
        }
        return sum;
    }

    public double average() {
        if (points.size() > 0) {
            return 1.0 * sum() / points.size();
        }
        return -1;
    }

    public double averagePassingGrade() {
        int sum = sumPassed();
        int passed = passed();
        if (passed > 0) {
            return 1.0 * sum / passed;
        }
        return -1;
    }

    public int passed() {
        int numPassing = 0;
        for (int point : points) {
            if (isMoreThanFifty(point)) {
                numPassing++;
            }
        }
        return numPassing;
    }

    public boolean isMoreThanFifty(int point) {
        if (point >= 50) {
            return true;
        }
        return false;
    }

    public double passPercent() {
        if (points.size() > 0) {
            return (100.00 * passed() / points.size());
        }
        return 0.0;
    }

    public int[] gradeDistribuition() {
        int[] grades = new int[6];
        int fives = 0,
                fours = 0,
                threes = 0,
                twos = 0,
                ones = 0,
                zeros = 0;

        for (int point : points) {
            if (point < 50) {
                grades[0]++;
                zeros++;
            } else if (point < 60) {
                grades[1]++;
                ones++;
            } else if (point < 70) {
                grades[2]++;
            } else if (point < 80) {
                grades[3]++;
            } else if (point < 90) {
                grades[4]++;
            } else if (point >= 90) {
                grades[5]++;
            }
        }

        return grades;
        //String.valueOf(fives+","+fours+","+threes+","+twos+","+ones+","+zeros);
    }

    public void printGrades(int[] grades) {
        System.out.print("5: ");
        printStar(grades[5]);
        System.out.print("4: ");
        printStar(grades[4]);
        System.out.print("3: ");
        printStar(grades[3]);
        System.out.print("2: ");
        printStar(grades[2]);
        System.out.print("1: ");
        printStar(grades[1]);
        System.out.print("0: ");
        printStar(grades[0]);

    }

    public void printStar(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}