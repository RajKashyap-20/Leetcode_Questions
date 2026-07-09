class Solution {
    public int lengthOfLongestSubstring(String s) {
       ArrayList <Character> str=new ArrayList<>();
       int start =0;
       int end =0;
       int max= 0;
       while (end<s.length()){
        if (!str.contains(s.charAt(end))){
            str.add(s.charAt(end));
            max= Math.max(max,str.size());
            end++;
        }
        else{
            str.remove(Character.valueOf(s.charAt(start)));
            start++;
        }
       }
       return max;
    }
}