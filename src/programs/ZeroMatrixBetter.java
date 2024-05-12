package programs;

import java.util.ArrayList;
import java.util.Arrays;

public class ZeroMatrixBetter {
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));

        int n = matrix.size();
        int m = matrix.getFirst().size();


        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);



        for(ArrayList<Integer> row: ans) {
            for(Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }

    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] rows = new int[n];
        int[] cols = new int[m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix.get(i).get(j) == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(rows[i] == 1 || cols[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

}
