class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList <Integer> arr=new ArrayList<>();
        for (int i=0;i<=nums1.length-1;i++){
            arr.add(nums1[i]);
        }
        for (int i=0;i<=nums2.length-1;i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        int s = arr.size();
        int t=s/2;
        float result =0;
        float ac=0;
        if (s%2!=0){
            result= arr.get(s/2);
        }
        
        else {
            ac = arr.get(s/2)+arr.get(s/2-1);
            result = ac/2;
        }
        return result;
    }
}