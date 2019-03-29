// Solution to Problem 154 on LeetCode in Java
// By Karel Vanhelden
public class Solution {
    public int findMin(int[] nums) {
        // O(n) 
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int min = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        
        return min;
    }
}
