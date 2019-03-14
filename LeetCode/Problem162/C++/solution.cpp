// Solution in C++ to LeetCode Problem 162
// By Karel Vanhelden
class Solution {
public:
   int findPeakElement(vector<int>& nums) {
        return findPeakUtil(nums, 0, nums.size() - 1);
    }
    
    int findPeakUtil(vector<int>& nums, int low, int high) {
        int mid = low + (high - low) / 2;
        if ((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == (nums.size() - 1) || nums[mid] > nums[mid + 1])) {
            return mid;
        } else if (mid > 0 && nums[mid] < nums[mid - 1]) {
            return findPeakUtil(nums, low, mid - 1);
        } else {
            return findPeakUtil(nums, mid + 1, high);
        } 
    }
};
