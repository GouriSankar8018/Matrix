public class Arr {

    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int count = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }
     // matrix row-wise
    public static void printMatrixRowWise(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
     // matrix column-wise
    public static void printMatrixColumnWise(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Creating a 2D array with 10 rows and 4 columns
        int[][] matrix = createMatrix(10, 4);
      
        System.out.println(" matrix row-wise:");
        printMatrixRowWise(matrix);

        System.out.println("matrix column-wise:");
        printMatrixColumnWise(matrix);
    } 
}
