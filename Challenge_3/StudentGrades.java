package Challenge_3;
import java.util.Scanner;

public class StudentGrades {

    static double mean(double english, double maths, double science) {
        return (english + maths + science) / 3;
    }

    static void printGrade(double average) {
        if (average >= 80) System.out.println("Grade: A");
        else if (average >= 70) System.out.println("Grade: B");
        else if (average >= 60) System.out.println("Grade: C");
        else if (average >= 50) System.out.println("Grade: D");
        else System.out.println("Grade: E");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students? ");
        int students = scanner.nextInt();

        for (int i = 1; i <= students; i++) {
            System.out.println("\nStudent " + i);

            System.out.print("English: ");
            double eng = scanner.nextDouble();

            System.out.print("Math: ");
            double math = scanner.nextDouble();

            System.out.print("Science: ");
            double science = scanner.nextDouble();

            double avg = mean(eng, math, science);
            System.out.printf("Mean: %.2f\n", avg);
            printGrade(avg);
        }

        scanner.close();
    }
}
