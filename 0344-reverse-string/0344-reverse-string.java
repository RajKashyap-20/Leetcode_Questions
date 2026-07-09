class Solution {
    public void reverseString(char[] s) {
        int lift=0,right=s.length-1;
        while(lift<right){
            char temp=s[lift];
            s[lift++]=s[right];
            s[right--]=temp;
            
        }

    }
}