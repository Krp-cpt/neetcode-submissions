class Solution {
    public int characterReplacement(String s, int k) {
       HashMap<Character,Integer> list = new HashMap<>();
       int i=0;
       int j=0;
       int maxlen =0;
       while(i<s.length()){
        list.put(s.charAt(i),list.getOrDefault(s.charAt(i),0)+1);
        int maxfreq = 0;
        for(int freq : list.values()){
            maxfreq = Math.max(maxfreq,freq);
        }
        if(i-j+1 - maxfreq > k){
            list.put(s.charAt(j),list.get(s.charAt(j))-1);
            j++;
        }
        else{
            maxlen = Math.max(maxlen,i-j+1);
        }
        i++;
       }
       return maxlen;
    }
}
