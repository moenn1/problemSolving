class Solution:
    def isPalindrome(self, x: int) -> bool:
        temp = x
        count = 0
        while(x>0):
            count = count*10+x%10
            x=x//10
        if temp==count:
            return True
        else:
            return False