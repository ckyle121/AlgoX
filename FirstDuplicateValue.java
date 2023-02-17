import java.util.HashSet;

public class FirstDuplicateValue {
    public int firstDuplicateValue(int[] array) {
    // put array into set
    HashSet<Integer> numSet = new HashSet<>();
    // loop through array, if value is in set, return value
    for (int i = 0; i < array.length; i++){
        if (numSet.contains(array[i])){
            return array[i];
        } else {
            numSet.add(array[i]);
        }
    }


    return -1;
}
}
