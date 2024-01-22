public class Main {
    public static void main(String[] args) {
        MatrixMath matrixMath = new MatrixMath();
        SimpleMath simpleMath = new SimpleMath();
        TrigMath trigMath = new TrigMath();

        System.out.println("Sum = " + simpleMath.getSum(3, 5));
        System.out.println("Circle square = " + trigMath.getCircleSquare(32));

        int[][] array = new int[][]{
                {4, 5, 6},
                {2, 8, 11},
                {8, 1, 3},
        };

        System.out.println("Sum main diag = " + matrixMath.getSumMainDiagonal(array));
    }
}