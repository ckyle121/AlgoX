import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(List<String> words) {
        List<List<String>> result = new ArrayList<>();
        // Write your code here.
        HashMap<String, List<String>> map = new HashMap<>();


        for (String word : words){
            char[] array = word.toCharArray();
            Arrays.sort(array);
            String sorted = new String(array);

            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(word);
        }

        for (List<String> values : map.values()){
            result.add(values);
        }



        return result;
    }
}
