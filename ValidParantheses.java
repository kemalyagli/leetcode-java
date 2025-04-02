//The method called "validParantheses" returns boolean
//and takes String "s" as parameter

//The method will return boolean according the valid order of brackets.

//Questions:
//Should i handle the situation where "s" is empty string or null? No
//Should i handle the situation where "s" contains any other characters than (){}[]? No

//Examples:
//Input: s = "()[]{}"
//Output: true

//Input: s = "(]"
//Output: false

import java.util.Stack;

public class ValidParantheses{
    public static boolean validParantheses(String s){
        boolean result = true;
        /*
        for each char c in s:
            if c is '(', '[', or '{' → push to stack
            else:
                if stack is empty → return false
                pop the top
                check if top + c form a valid pair like () or [] or {}
                if not → return false

        return stack is empty
        */ 

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                String pair = "" + stack.peek() + s.charAt(i);
                if (pair.equals("()") || pair.equals("[]") || pair.equals("{}")) {
                    stack.pop(); // valid pair, remove the opening
                }else {
                    return false; // mismatched pair
                }
            }
        }
        return stack.isEmpty();
    }
}


