// Solution in C++ to LeetCode Problem 153
// By Karel Vanhelden
class Solution {
public:
    int findMin(vector<int>& nums) {
        if (nums.size() == 1) return nums[0];
      
        int target = nums[0], lo = 1, hi = nums.size() - 1, med;
      
        while (nums[lo] == target && lo < nums.size() - 1) lo++;
      
        while (lo < hi) {
            med = lo + (hi - lo) / 2;
            if (nums[med] > target) lo = med + 1;
            else hi = med;
        }
        return min(target, nums[lo]);
   
    }
};
