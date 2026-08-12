class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map= new HashMap<>();
        for(String words:strs){
            char[] chars= words.toCharArray();
            Arrays.sort(chars);
            String SortedWord= new String(chars);

            if(!map.containsKey(SortedWord)){
                map.put(SortedWord,new ArrayList<>());
            }
            map.get(SortedWord).add(words);
        }
        return new ArrayList<>(map.values());
    }
}