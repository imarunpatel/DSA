package Java;

public class Test {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] ans = zeroMatrix(matrix, n, m);

        for(int[] row : ans) {
            for(int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

    }

    static int[][] zeroMatrix(int[][] matrix, int n, int m) {
        int col0 = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;

                    if(j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                if(matrix[i][j] != 0) {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int i=0; i<m; i++) matrix[0][i] = 0;
        }

        if(col0 == 0) {
            for(int i=0; i<n; i++) matrix[i][0] = 0;
        }
        return matrix;
    }
}