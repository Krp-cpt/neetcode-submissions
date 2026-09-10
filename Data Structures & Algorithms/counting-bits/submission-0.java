class Solution {
    public int[] countBits(int n) {
      int[] arr = new int[n+1];
      int i = 0;
      while(i<=n){
        int x = i;
        int count =0;
        while(x != 0){
            x = x & (x-1);
            count++;
        }
        arr[i] = count;
        i++;
      }  
      return arr;
    }
}
