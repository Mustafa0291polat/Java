import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("The number is equal to 1.");
                break;
            case 2:
                System.out.println("The number is equal to 2.");
                break;
            case 3:
                System.out.println("The number is equal to 3.");
                break;
            default:
                System.out.println("You entered an invalid number.");
        }
    }
}

