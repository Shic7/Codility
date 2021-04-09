import java.util.Stack;

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        if(S.isEmpty())
            return 1;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i < S.length(); i++)
        {
            if(S.charAt(i) == '(' || S.charAt(i) == '[' || S.charAt(i) == '{')
                stack.push(S.charAt(i));

            else if(S.charAt(i) == ')' || S.charAt(i) == ']' || S.charAt(i) == '}')          
            {
                if(stack.empty())
                    return 0;

                if(S.charAt(i) == ')' && stack.peek() == '(')
                    stack.pop();

                else if(S.charAt(i) == ']' && stack.peek() == '[')
                    stack.pop();

                else if(S.charAt(i) == '}' && stack.peek() == '{')
                    stack.pop();

                else
                    return 0;
            }
        }

        if(!stack.empty())
            return 0;

        return 1;
    }
}
