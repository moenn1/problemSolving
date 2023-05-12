public class Oracle {

    /*
    I want to compute S=x^0 + x + x^2 + x^3 + x^4 + ... + x^N
    (where x is a floating point number, N an integer), how would you do that?
     */

    public static double calc(double x, int N){
        double s = 0;
        int i=0;
        while(i<=N){
            s += Math.pow(x, i);
            i++;
        }
        return s;
    }





    //n*log(n)
    public static double power(double x, int n) {
        if(n==0)
            return 1;
        if(n == 1)
            return x;
        else if (n % 2 == 1) {
            double r = power(x, n / 2);
            return r * r * x;
        } else {
            double r = power(x, n / 2);
            return r * r;
        }
    }



}
