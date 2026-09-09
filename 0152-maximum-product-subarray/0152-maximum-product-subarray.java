class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        
        // Start from index 1 since index 0 is already initialized
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            
            // Store the temporary max calculation
            int temp = Math.max(curr, Math.max(max * curr, min * curr));
            
            // Calculate min using the old max value before updating max
            min = Math.min(curr, Math.min(max * curr, min * curr));
            
            max = temp;
            res = Math.max(res, max);
        }
        
        return res;
    }
}
