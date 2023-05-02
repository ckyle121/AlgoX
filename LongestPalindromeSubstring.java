import java.util.*;

class Program {
    public static String longestPalindromicSubstring(String str) {
        String longest = "";

        for (int i = 0; i < str.length(); i++){
            for (int j = i; j < str.length(); j++){
                String sub = str.substring(i, j + 1);

                if (sub.length() > longest.length() && isPalindrome(sub)){
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() -1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
