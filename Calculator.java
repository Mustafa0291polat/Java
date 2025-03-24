import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, choice;

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        System.out.println("PLEASE SELECT THE OPERATION YOU WANT TO PERFORM: ");
        System.out.println("1-Addition \n2-Subtraction \n3-Multiplication \n4-Division");
        System.out.print("YOUR CHOICE: ");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Addition: " + (number1 + number2));
        } else if (choice == 2) {
            System.out.println("Subtraction: " + (number1 - number2));
        } else if (choice == 3) {
            System.out.println("Multiplication: " + (number1 * number2));
        } else if (choice == 4) {
            if (number2 == 0) {
                System.out.println("The second number is 0, and the result is undefined.");
            } else {
                System.out.println("Division: " + ((double) number1 / number2)); // Bölme işlemi doğru çalışsın diye double dönüşümü eklendi.
            }
        } else {
            System.out.println("You entered an invalid operation, please try again!");
        }
    }
}

