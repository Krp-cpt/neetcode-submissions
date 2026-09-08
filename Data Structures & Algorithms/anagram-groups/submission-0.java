class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> list  = new ArrayList<>();
       HashMap<String,List<String>> map = new HashMap<>();
       for(String word:strs){
        char[] ch = word.toCharArray();
        Arrays.sort(ch);
        String key  = new String(ch);
        if(map.containsKey(key)){
            map.get(key).add(word);
        }
        else{
            List<String> l1 = new ArrayList<>();
            l1.add(word);
            map.put(key,l1);
        }
       } 
       list.addAll(map.values());
       return list;
    }
}
