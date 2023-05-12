package Hackerrank;

import java.util.*;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0;
        int orangeCount = 0;
        //Sams house is between s and t. We will need this to check for values in this interval after we add the a to the d values of apples, and b to the d values of oranges
        for (int i=0; i<apples.size();i++){
            apples.set(i, a+apples.get(i));
        }

        for (int i=0; i<oranges.size();i++){
            oranges.set(i, b+oranges.get(i));
        }

        //Now we check for values in the interval [s,t]
        for (int i=0; i<apples.size();i++){
            if(apples.get(i)>=s && apples.get(i)<=t)
                appleCount++;
        }

        for (int i=0; i<oranges.size();i++){
            if(oranges.get(i)>=s && oranges.get(i)<=t)
                orangeCount++;
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
