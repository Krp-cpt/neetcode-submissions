class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       int i=1;
       int count = 1;
       int max = 0;
       if(nums.length == 0){
        return max;
       } 
       if(nums.length == 1){
        return count;
       }
       while(i<nums.length){
        int j = i-1;
        int diff = nums[i] - nums[j];
        if(diff == 1){
            count++;
        }
        else if(diff == 0)
        {

        }
        else{
            max = Math.max(max,count);
            count = 1;
        }
        i++;
       }
       max = Math.max(max,count);
       return max;
    }
}
