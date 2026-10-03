class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> help= new HashSet<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for (int i:nums){
            if (help.contains(i)){
                ans.add(i);
            }
            else{
                help.add(i);
            }
        }
        return ans;

    }
}