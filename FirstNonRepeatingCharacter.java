public class FirstNonRepeatingCharacter {

    public int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        for (int i = 0; i < string.length(); i++){
            String ch = String.valueOf(string.charAt(i));
            if (string.indexOf(ch) == string.lastIndexOf(ch)){
                return i;
            }
        }
        return -1;
    }
}
