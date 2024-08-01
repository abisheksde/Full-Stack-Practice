public class MatrixMultiplication {
    public static void main(String[] args) {
        //https://youtu.be/vhQHCICOKwU
        int[][] matrix1 = {{2,1},{1,3}};
        int[][] matrix2 = {{2,0},{1,3}};

        int[][] matrix = multiplyMatrix(matrix1, matrix2);

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("\n");
        }

    }

    static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2){
        int[][] matrix = new int[2][2];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix[i][j] = 0;
                for (int k = 0; k < matrix1.length; k++) {
                    matrix[i][j] = matrix[i][j] + matrix1[i][k]*matrix2[k][j];
                }
            }
            
        }
        return matrix;
    }
}
