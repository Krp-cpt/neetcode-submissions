class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int right = 0;
        int left = 0;
        int maxlen = 0;
        while(right<s.length()){
            while(list.contains(s.charAt(right))){
                list.remove(Character.valueOf(s.charAt(left)));
                left++;
            }
            list.add(s.charAt(right));
            maxlen = Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}
