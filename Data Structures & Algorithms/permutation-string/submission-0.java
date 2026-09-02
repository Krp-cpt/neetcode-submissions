class Solution {
       static boolean issame(int[] one,int[] two){
        for(int i=0;i<26;i++)
        {
            if(one[i] != two[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
         int[] freq = new int[26];
        for(char ch : s1.toCharArray()){
            freq[ch - 'a']++;
        }
        int windsize = s1.length();
        for(int i=0;i<s2.length();i++){
            int[] dupli = new int[26];
            int index = i;
            int windind = 0;
            while(windind < windsize && index < s2.length()){
                dupli[s2.charAt(index) - 'a']++;
                index++;
                windind++;
            }
            if(issame(dupli,freq)){
                return true;
            }
        }
        return false; 
    }
}
