class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2= s2.length();
        if(l1>l2){
            return false;
        }
        int[]a1= new int[26];
        int a2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            a1[s1.charAt(i)-'a']++;
            a2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(a1,a2)){
            return true;
        }
        for(int i=l1;i<s2.length();i++){
            a2[s2.charAt(i)-'a']++;
            a2[s2.charAt(i-l1)-'a']--;
            if(Arrays.equals(a1,a2)){
                return true;
            }
        }

        return false;
    }
}