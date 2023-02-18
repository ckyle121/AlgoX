import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Semordnilap {
    public ArrayList<ArrayList<String>> semordnilap(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words){
            set.add(word);
        }

        ArrayList<ArrayList<String>> result = new ArrayList<>();



        for (String word : words){
            StringBuilder sb = new StringBuilder(word);
            String reversed = sb.reverse().toString();
            if (set.contains(reversed) && !reversed.equals(word)){
                ArrayList<String> pair = new ArrayList<>();

                pair.add(reversed);
                pair.add(word);
                result.add(pair);
                set.remove(word);
                set.remove(reversed);
            }
        }
        return result;
    }
}
