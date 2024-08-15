
public class AddMatrics {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{5,2,4},{1,5,9},{7,6,2}};

        int[][] matrix = addMatrix(matrix1, matrix2);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("\n");
        }

        //System.out.println(addMatrix(matrix1, matrix2));
    }

    static int[][] addMatrix(int[][] matrix1, int[][] matrix2){

        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return matrix;
    }
}
