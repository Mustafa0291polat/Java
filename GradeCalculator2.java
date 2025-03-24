import java.util.Scanner;

public class GradeCalculator2 {
    public static void main(String[] args) {
        int english, math, science, physicalEducation;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your English grade: ");
        english = input.nextInt();

        System.out.print("Enter your Math grade: ");
        math = input.nextInt();

        System.out.print("Enter your Science grade: ");
        science = input.nextInt();

        System.out.print("Enter your Physical Education grade: ");
        physicalEducation = input.nextInt();

        double average = (english + math + science + physicalEducation) / 4.0;
        System.out.println("Average grade: " + average);

        if (average < 50) {
            System.out.println("You failed.");
        } else {
            System.out.println("You passed.");
        }

        input.close();
    }
}

