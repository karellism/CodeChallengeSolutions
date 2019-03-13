// Solution in C++ to LeetCode Problem 704 - Binary Search 
// By Karel Vanhelden
class Solution {
public:
    int search(vector<int>& nums, int target) {
        int l = 0;
        int r = nums.size() - 1;
        
        while (l <= r) {
          auto mid = l + (r - l)/2;
          if (nums[mid] == target) return mid;
          if (nums[mid] < target) l = mid + 1;
          else r = mid - 1;          
        }
      
    return -1;
    }
};
