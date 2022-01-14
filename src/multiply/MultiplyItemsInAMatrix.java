package multiply;

public class MultiplyItemsInAMatrix {
    public static int multiplyItems(int[][] matrix) {
        if (matrix == null) {
            return 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    System.out.print(matrix[i][j] + "EVEN ");
                }
                else {
                    System.out.print(matrix[i][j] + "ODD ");
                }
            }
            System.out.println();
        }

        int multiplyMatrix = 0;

        return multiplyMatrix;
    }

}

// No time to figure out full solution sorry...
