import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Get the absolute value to map to the correct index
            int index = Math.abs(nums[i]) - 1;
            
            // If the element at that index is already negative, it's a duplicate
            if (nums[index] < 0) {
                ans.add(index + 1);
            } else {
                // Otherwise, flip the sign to mark it as visited
                nums[index] = -nums[index];
            }
        }
        
        return ans;
    }
}
