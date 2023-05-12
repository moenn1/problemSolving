class Solution:
    def valint(self, c: str) -> int:
        if (c == 'I'):
            return 1
        if (c == 'V'):
            return 5
        if (c == 'X'):
            return 10
        if (c == 'L'):
            return 50
        if (c == 'C'):
            return 100
        if (c == 'D'):
            return 500
        if (c == 'M'):
            return 1000
        return 0
    
    def romanToInt(self, s: str) -> int:
        count = 0
        for i in range(len(s)-1):
            s1 = self.valint(s[i])
            if i<len(s):
                s2 = self.valint(s[i+1])
                if s1 <= s2:
                    count = count + s1
                else:
                    count = count + s2 - s1
            else:
                count = count + 1
        return count