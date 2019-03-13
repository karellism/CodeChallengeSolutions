// Solution in C++ to Problem 278 - First Bad Version at LeetCode
// By Karel Vanhelden
bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
      int l = 1, h = n, m;
        
      while(l < h) {
         m = l + (h - l) / 2;
         if(!isBadVersion(m)) l = m + 1;
            else h = m;
        }
        return l;
    }
};
