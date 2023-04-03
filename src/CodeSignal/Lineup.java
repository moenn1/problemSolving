package CodeSignal;

public class Lineup {
    int solution(String commands) {
        int t = 0;
        boolean s = true;
        for (char c : commands.toCharArray()) {
            if (c == 'L' || c == 'R')
                s = !s;
            if (s)
                t++;
        }
        return t;
    }
}
