package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(ans(s));
    }

    private static boolean ans(String s) {
        Stack <Character> st = new Stack<>();
        for (int left = 0; left< s.length(); left++){
            if(s.charAt(left) == '(' || s.charAt(left) == '[' || s.charAt(left) == '{'){
                st.push(s.charAt(left));
            }else{
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if(s.charAt(left) == ')' && top != '('){
                    return false;
                }else if(s.charAt(left) == ']' && top != '['){
                    return false;
                }else if(s.charAt(left) == '}' && top != '{'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
