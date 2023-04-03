package CodeSignal;

public class Candles {
    int solution(int candlesNumber, int makeNew) {
        int leftovers = candlesNumber;
        int nbrCandles= candlesNumber;
        int n;
        while(leftovers>=makeNew){
           n = leftovers/makeNew;
           leftovers -= (leftovers - leftovers%makeNew);
           leftovers += n;

           nbrCandles += n;
        }
        return nbrCandles;
    }
}
