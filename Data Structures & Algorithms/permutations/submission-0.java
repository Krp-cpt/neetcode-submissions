class Solution {
    void backtrack(List<List<Integer>> list,List<Integer> temp,int[] n,boolean[] used){
       if(temp.size() == n.length){
        list.add(new ArrayList(temp));
       return;
       }
        for(int i=0;i<n.length;i++)
        {
            if(used[i]){
                continue;
            }
            temp.add(n[i]);
            used[i] = true;
            backtrack(list,temp,n,used);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
       
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(result,new ArrayList<>(),nums,used);
        return result;
    }
}
