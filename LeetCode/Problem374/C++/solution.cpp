// Solution in C++ to Problem 374 - Guess Number Higher or Lower from LeetCode
// By Karel Vanhelden
int guess(int num);

class Solution {
public:
  int guessNumber(int n) {
    int max = n, min = 1;
      while (true) {
        int mean = (max - min) / 2 + min;
        // Do NOT use (max+min)/2
        int res = guess(mean);
        if (res == 0) { 
            return mean;
        } else if (res == 1) {
             min = mean + 1;
        } else {
             max = mean - 1;
        }
    }
  }
};
