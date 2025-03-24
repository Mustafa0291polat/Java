import java.util.Scanner;

public class CostCalculator {
    public static void main(String[] args) {
        int cost;
        double vatRate;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cost:");
        cost = input.nextInt();

        System.out.println("Enter VAT rate:");
        vatRate = input.nextDouble(); 

        double newTotal = cost + (cost * vatRate / 100); 
        System.out.println("New total: " + newTotal);
    }
}
