import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static int[] twoNumberSum(int[] array, int targetSum ){
        int[] result = new int[2];

        Set<Integer> set= new HashSet<>();

        for (var num : array){
            set.add(num);
        }

        for (var num: array){
            if (set.contains(targetSum - num)){
                result[0] = num;
                result[1] = targetSum - num;
            }
        }

        return result;
    }

}
