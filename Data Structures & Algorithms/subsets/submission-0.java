class Solution {
    void backtrack(List<List<Integer>> result,List<Integer> temp,int[] n,int start){
        result.add(new ArrayList<>(temp));
        for(int i=start;i<n.length;i++)
        {
            temp.add(n[i]);
            backtrack(result,temp,n,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums,0);
        return result;
    }
}
