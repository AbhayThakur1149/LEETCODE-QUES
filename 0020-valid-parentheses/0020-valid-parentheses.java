class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack();
        int size = s.length();
        for(int i = 0; i < size; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else {
                if(st.isEmpty()) return false;
                char top = st.peek();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
        
    }
}