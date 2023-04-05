package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayDS {

    public static int TwoDArrayDS(List<List<Integer>> arr) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<4; i++){
            List<Integer> l = new ArrayList<>();
            int sum = 0;
            for (int j=0; j<4; j++){
                sum = (arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2) + arr.get(i+1).get(j+1));
                l.add(sum);
            }
            res.add(l);
        }
        int max = res.get(0).get(0);
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if(max<res.get(i).get(j))
                    max = res.get(i).get(j);
            }
        }
        return max;
    }


}
