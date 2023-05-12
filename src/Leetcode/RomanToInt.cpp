#include <iostream>
#include <string>
using namespace std;


class Solution {
public:
    int value(char c){
        if (c == 'I')
            return 1;
        if (c == 'V')
            return 5;
        if (c == 'X')
            return 10;
        if (c == 'L')
            return 50;
        if (c == 'C')
            return 100;
        if (c == 'D')
            return 500;
        if (c == 'M')
            return 1000;
        return -1;
    }

    int romanToInt(string s) {
        int count = 0, s1, s2;
        for (int i = 0; i < s.length(); i++)
        {
            s1 = value(s[i]);
            if((i+1)<s.length()){
                s2 = value(s[i+1]);
                if(s1>=s2)
                    count += s1;
                else{
                    count += s2-s1;
                    i++;
            }
            }
            else
                count += s1;
        }
        return count;
    }
};

int main(){
    Solution a;
    cout << a.romanToInt("IC");

    return 0;
}