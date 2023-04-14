import java.util.*;

class Program {
    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        String letters = "abcdefghijklmnopqrstuvwxyz";

        String result = "";

        while (key > 26){
            key -= 26;
        }

        for (char ch : str.toCharArray()){
            int newCharIdx = letters.indexOf(ch) + key;

            if (newCharIdx >= 26){
                newCharIdx -= 26;
            }

            result += letters.charAt(newCharIdx);
        }

        return result;
    }
}
