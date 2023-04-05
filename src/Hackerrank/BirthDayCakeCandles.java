package Hackerrank;

import java.util.List;

public class BirthDayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int n = 0, max = -1;

        for(int i: candles){
            if (i>max)
                max = i;
        }
        for(int i:candles){
            if(i == max)
                n++;
        }
        return n;

    }


}
