class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int s=0;
        int e=numbers.length-1;
        int cr=0;
        int arr[]=new int [2];
        while(s<e){
            cr=numbers[s]+numbers[e];
            if(cr==target) {
                arr[0]=s+1;
                arr[1]=e+1;
                return arr;}
            else if(cr>target){
                e--;
            }
            else s++;
        }
        return arr;
    }
}