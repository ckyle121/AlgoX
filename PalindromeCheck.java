public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        if (str == null){
            return true;
        }
        // Write your code here.
        int left = 0;
        int right = str.length()-1;

        while(left <= right){
            if (str.charAt(left++) != str.charAt(right--))
                return false;
        }

        return true;
    }
}
