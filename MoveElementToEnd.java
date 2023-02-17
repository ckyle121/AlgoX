import java.util.List;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int left = 0;
        int right = array.size() -1;

        while (left < right){
            while (left < right && array.get(right) == toMove){
                right--;
            }

            if (array.get(left) == toMove){
                var temp = array.get(left);
                array.set(left, array.get(right));
                array.set(right, temp);
            }

            left++;

        }
        return array;
    }
}
