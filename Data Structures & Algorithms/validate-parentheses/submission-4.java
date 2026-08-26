class Solution {
    public boolean isValid(String s) {
       Stack<Character> par = new Stack<>();
       for(char ch:s.toCharArray()){
        if(ch == '(' || ch == '[' || ch == '{'){
            par.push(ch);
        }
      else{
        if(par.isEmpty()){
            return false;
        }
        char top = par.pop();
        if(top == '(' && ch != ')'){
            return false;
        }
         if(top == '[' && ch != ']'){
            return false;
        }
         if(top == '{' && ch != '}'){
            return false;
         }
      }
       } 
       if(par.isEmpty()){
       return true;
       }
       return false;
    }
}
