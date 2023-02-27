import java.util.HashMap;
import java.util.Stack;

public class BalanceBrackets {
    public static boolean balancedBrackets(String str) {
        // create a map of key value pairs that is opening and brackets
        HashMap<Character, Character> bracketMap = new HashMap<>();

        bracketMap.put(')', '(');
        bracketMap.put(']', '[');
        bracketMap.put('}', '{');


        // create a stack
        Stack<Character> bracketStack = new Stack<>();

        // split string into character array

        var charArray = str.toCharArray();

        for (var ch : charArray){
            // if character is opening braket, add it to the stack
            if (ch == '(' || ch == '[' || ch == '{'){
                bracketStack.add(ch); // ({[
            } else if (ch == ')' || ch == ']' || ch == '}'){
                // if character is closing bracket,
                if (bracketStack.isEmpty()){
                    return false;
                }
                // get last character in stack and see if it's the key to the closing bracket
                char last = bracketStack.peek(); // [

                // check to see if last is the key to the hashmap of the closign bracket

                if (last == bracketMap.get(ch)){
                    bracketStack.pop();
                }

                else {
                    return false;
                }
            }

        }

        return bracketStack.isEmpty();
    }
}
