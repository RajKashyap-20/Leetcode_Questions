class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]= new int[2];
        int f=0;
        int l=0;
        if(nums.length==0){
            l=-1;
            f=-1;
        }
        else{
            for(int i=0;i<nums.length;i++){
            if (nums[i]==target){
                f=i;
                break;
            }
            else{
                f=-1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if (nums[i]==target){
                l=i;
                break;
            }
            else{
                l=-1;
            }
        }
        }
        arr[0]=f;
        arr[1]=l;
        return arr;
    }
}