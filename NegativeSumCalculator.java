//
public class NegativeSumCalculator {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, -7, -3};

        int sum = sumNegativeNumbers(numbers);
        System.out.println(sum);
    }

    public static int sumNegativeNumbers(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number < 0) {
                sum += number;
            }
        }
        return sum;
    }
}
