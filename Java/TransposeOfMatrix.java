public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrixA = {{2,3,5},{1,7,8}};

        int[][] matrix = transpose(matrixA);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("\n");
        }
    }

    static int[][] transpose(int[][] matrixA){

        int[][] matrix = new int[3][2];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j <= matrixA.length; j++) {
                matrix[j][i] = matrixA[i][j];
            }
            
        }

        return matrix;
    }
}
