public class MatrixPrinter {
    public static void main(String[] args) {
        int numbers[][] = { {1, 2, 3}, {4, 5, 6} };

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.println(row + " row, " + column + " column: " + numbers[row][column]);
            }
        }
    }
}
