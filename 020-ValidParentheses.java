package LeetCode;

import java.util.Stack;

public class No020ValidParentheses {

    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid.
     * The brackets must close in the correct order,
     * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */

    public static void main(String[] args) {

        String s = "}";
        String s1 = "()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        if(s == null || s.length() == 0) return false;

        Stack<Character> sc = new Stack<Character>();
        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; i++) {

            //System.out.println(c[i]);

            if(c[i] == '(' || c[i] == '[' || c[i] == '{') {

                sc.push(c[i]);

            } else if((c[i] == ')' && sc.size() != 0 && sc.peek() == '(') ||
                    (c[i] == ']' && sc.size() != 0 && sc.peek() == '[') ||
                    (c[i] == '}' && sc.size() != 0 && sc.peek() == '{')) {  // 注意这里 不能让空栈 peek

                //System.out.println(c[i]+" 可以找到匹配的左括号，左括号弹出");
                sc.pop();

            } else {

                //System.out.println(c[i]+" 不可以找到匹配的左括号，返回false");
                return false;
            }
        }

        if(sc.size() == 0) {

            return true;

        } else {

            return false;
        }

    }
}

class CharStack {
    
    final StringBuilder sb = new StringBuilder();

    public void push(char ch) {
        sb.append(ch);
    }

    public char pop() {
        int last = sb.length() -1;
        char ch= sb.charAt(last);
        sb.setLength(last);
        return ch;
    }

    public int size() {
        return sb.length();
    }
}