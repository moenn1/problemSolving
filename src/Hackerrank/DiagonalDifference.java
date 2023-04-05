package Hackerrank;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int lrDiag = 0;
        int rlDiag = 0;
        for(int i=0; i<arr.size(); i++){
            lrDiag += arr.get(i).get(i);
        }
        for(int i=0; i<arr.size(); i++){
            rlDiag += arr.get(i).get(arr.get(0).size()-i-1);
        }

        return Math.abs(lrDiag-rlDiag);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(
                List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12)
        );

        System.out.println(diagonalDifference(arr));
    }
}
