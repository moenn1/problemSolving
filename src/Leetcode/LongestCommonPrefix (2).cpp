#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string commonPrefix = "";
		int n = strs.size();
		sort(strs.begin(), strs.end());

		string a = strs[0];
		string b = strs[n-1];

		for (int i = 0; i < a.size(); i++)
		{
			if (a[i] == b[i])
			{
				commonPrefix += a[i];
			}
			else{
				break;
			}
		}
		

		return commonPrefix;
    }
};

int main(){
	Solution A;
	cout << "";
	return 0;
}