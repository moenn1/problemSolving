#include <iostream>
#include <vector>
#include <string>
#include <stack>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
		stack<char> p;
		for (int i = 0; i < s.length(); i++)
		{
			if (s[i] == '(' or s[i] == '{' or s[i] == '[')
			{
				p.push(s[i]);
			}
			if (s[i] == ')' or s[i] == '}' or s[i] == ']')
			{
				p.pop();
			}
		}
		if(p.empty())
			return true;
		return false;
    }
};

int main(){
	Solution A;
	cout << "";
	return 0;
}