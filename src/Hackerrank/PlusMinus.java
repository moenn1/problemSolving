package Hackerrank;

import java.util.*;
public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        List<Integer> zero = new ArrayList<>();

        for(int i: arr){
            if(i > 0)
                pos.add(i);
            else if (i < 0)
                neg.add(i);
            else
                zero.add(i);
        }
        System.out.println(String.format("%.6f", (double)pos.size()/arr.size()));
        System.out.println(String.format("%.6f", (double)neg.size()/arr.size()));
        System.out.println(String.format("%.6f", (double)zero.size()/arr.size()));
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 1, 0, -1, -1);
        plusMinus(arr);
    }
}
