import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter 3 integers: ");
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("The numbers in reverse order: ");
        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}


