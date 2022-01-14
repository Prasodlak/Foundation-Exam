package multiply;

public class MultiplyItemsInAMatrix {
    public static int multiplyItems(int[][] matrix) {
        if (matrix == null) {
            return 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
            }
        }

        int multiply = 0;

        return multiply;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3},
        };

        System.out.println(multiplyItems(matrix));
    }

}
