public class RunLengthEncoding {
    public String runLengthEncoding(String str) {
        // Write your code here.
        String encoded = "";

        char letter = str.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (letter == str.charAt(i) && count < 9){
                count++;
            }
            else if (letter != str.charAt(i) || count >=9){
                encoded += "" + count + letter;
                count = 1;
            }

            letter = str.charAt(i);
        }

        encoded += "" + count + letter;

        return encoded;
    }
}
