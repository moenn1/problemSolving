package Hackerrank;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {

        int max = 0, min = 0;
        Collections.sort(arr, Collections.reverseOrder());
        for (int i=0; i<4; i++){
            min += arr.get(i);
            max += arr.get(i+1);
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {

        List<Integer> arr = List.of(793810624, 895642170, 685903712, 623789054, 468592370);
        miniMaxSum(arr);
    }

}
