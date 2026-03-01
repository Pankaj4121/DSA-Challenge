package Medium_Level;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([)]";
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            } else {
                if(stk.isEmpty()){
                    System.out.println("False");
                    return;
                }
                char top = stk.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    System.out.println("false");
                    return;
                }
            }
        }

        if (stk.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
