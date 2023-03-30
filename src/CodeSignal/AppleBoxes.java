package CodeSignal;

public class AppleBoxes {

    static int solution(int k) {
        int yellowApples = 0;
        int redApples = 0;
        for (int i=1; i<=k; i++){
            if(i%2==1)
                yellowApples += i*i;
            else
                redApples += i*i;
        }
        return redApples - yellowApples;
    }
    public static void main(String[] args) {
        System.out.println(solution(5));
    }


}
