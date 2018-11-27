import java.util.Stack;

public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chs = s.toCharArray();
        for (char ch : chs) {
            if (stack.size() == 0) {
                stack.push(ch);
            } else if (isPair(stack.peek(), ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.size() == 0;
    }

    private boolean isPair(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }

    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        System.out.print(solution20.isValid("([)]"));
    }
}
