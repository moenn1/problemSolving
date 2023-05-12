#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class Solution {
public:
    bool isPalindrome(int x) {
        string strX = to_string(x);
        int i=0, j=strX.size()-1;
        while (i<j)
        {
            if (strX[i]!=strX[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
};

void main(){


}