package CodeSignal;

public class AdditionWithoutCarrying {
    int solution(int param1, int param2) {
        if (param1 == 0)
            return param2;
        if (param2 == 0)
            return param1;
        String result = "";
        while(param1 != 0 && param2 != 0){
            result += (char)(param1%10 + param2%10)%10;
            param1 = param1/10;
            param2 = param2/10;
        }
        if(param1 != 0){
            result += param1;
        }
        if(param2 != 0){
            result += param2;
        }
        char ch;
        String res = "";
        for (int i=0; i<result.length(); i++)
        {
            ch= result.charAt(i);
            res= ch+res;
        }
        return Integer.parseInt(res);
    }


    public static void main(String[] args) {
        AdditionWithoutCarrying a = new AdditionWithoutCarrying();
        System.out.println(a.solution(456, 1734));
    }
}
