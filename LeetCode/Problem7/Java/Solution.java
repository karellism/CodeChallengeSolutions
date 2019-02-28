// My solution to Problem 7 on LeetCode in Java
// By Karel Vanhelden

class Solution {
  public int reverse(int x) {
        int sign = x>0? 1: -1;
        x *= sign;
        int ret = 0;
        while(x>0) {
            ret *= 10;
            if(ret<0 || x>10&&ret*10/10!=ret) // overflow
                return 0;

            ret += x%10;
            x /= 10;
        }
        return ret*sign;
    }

    public static void main(String[] args) {
        assert new Solution().reverse(-2147483412)==-2147483412;
    }
}
