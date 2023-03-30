package CodeSignal;

public class IncreaseNumberRoundness {

    boolean solution(int n) {
        String number = Integer.toString(n);
        if (!number.contains("0")) return false;
        for (int i=number.indexOf("0")+1; i<number.length(); i++){
            if(number.charAt(i) != '0') return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
