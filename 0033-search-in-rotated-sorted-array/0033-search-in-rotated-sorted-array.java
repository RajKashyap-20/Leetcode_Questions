class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        // Bug Fix 1: Changed < to <= to handle single-element arrays
        while (left <= right) {
            // Bug Fix 2: Changed right + ... to left + ...
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) return mid;

            // Check if the left half is sorted normally
            if (nums[left] <= nums[mid]) {
                // Bug Fix 3: Changed 'l' to 'left'
                // If target lies perfectly within the sorted left half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // Otherwise, the right half must be sorted normally
            else {
                // If target lies perfectly within the sorted right half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
