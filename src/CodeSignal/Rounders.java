package CodeSignal;

public class Rounders {
    static int solution(int n) {
        int i = 1;
        while(n>10){
            i *= 10;
            n = n/10 + ((n%10 >= 5) ? 1: 0);
        }
        return n*i;
    }

    public static void main(String[] args) {
        System.out.println(solution(1234));
    }

}
