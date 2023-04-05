package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {


    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> res = new ArrayList<>();
        int count;
        for(String i: queries){
            count = 0;
            if(stringList.contains(i)){
                for (String j: stringList){
                    if(i.equals(j))
                        count++;
                }
            }
            res.add(count);
        }
        return res;
    }

}
