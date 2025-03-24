import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int midterm, finalExam;

        System.out.print("Enter midterm score: ");
        midterm = input.nextInt();
        System.out.print("Enter final score: ");
        finalExam = input.nextInt();

        double average = (midterm * 0.4 + finalExam * 0.6);
        System.out.println("Average: " + average);

        String result = (average >= 50) ? "Passed" : "Failed";
        System.out.println(result);
    }
}
