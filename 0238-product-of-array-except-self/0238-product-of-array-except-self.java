class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []left= new int[nums.length];
        int []right= new int [nums.length];
        int ans[]= new int[nums.length];
        int productl=1;
        int productr=1;
        for(int i=0;i<nums.length;i++){

            if(i==0) left[i]=1;
            else{
            productl*=nums[i-1];
            left[i]=productl;
            }
        }
         for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1) right[i]=1;
            else{
            productr*=nums[i+1];
            right[i]=productr;
            }
        }
         for(int i=0;i<nums.length;i++){
            ans[i]= left[i]*right[i];
        }
        return ans;
    }
}