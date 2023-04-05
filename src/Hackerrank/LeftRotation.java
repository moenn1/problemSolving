package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        List<Integer> rotatedArr = new ArrayList<>();

        for(int i=0; i<arr.size()-d; i++){
            rotatedArr.add(arr.get(i+d));
        }

        for (int i=0;i<d;i++){
            rotatedArr.add(arr.get(i));
        }



        return rotatedArr;
    }



}
