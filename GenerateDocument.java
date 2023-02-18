import java.util.HashMap;

public class GenerateDocument {
    public boolean generateDocument(String characters, String document) {
        // put characters in a map
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char ch : characters.toCharArray()){
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        // put document characters into a map
        HashMap<Character, Integer> docMap = new HashMap<>();
        for (char ch : document.toCharArray()){
            docMap.put(ch, docMap.getOrDefault(ch, 0 ) + 1);
        }

        for (char ch : document.toCharArray()){
            if (!charMap.containsKey(ch) || charMap.get(ch) < docMap.get(ch)){
                return false;
            }
        }

        return true;
    }
}
