package w3resources_java_exercises.basicpart1;

/**
 * 120. Write a Java program that searches a value in an m x n matrix.
 */
public class Ex120 {
    public static void main(String[] args) {
        int target = 3;
        int[][] matrix = new int[3][3];
        int counter = 1;
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++) {
                matrix[row][col] = counter++;
                System.out.print(matrix[row][col] + " ");
                if (col == 2) {
                    System.out.println();
                }
            }
        }
        System.out.print(searchMatrix(matrix, target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        boolean returnValue = false;
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++) {
                if (matrix[row][col] == target) {
                    returnValue = true;
                }
            }
        }
        return returnValue;
    }
}