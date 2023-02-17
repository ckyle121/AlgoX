public class FindThreeLargestNumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        int mid = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                min = mid;
                mid = max;
                max = array[i];
            } else if (array[i] > mid){
                min = mid;
                mid = array[i];
            } else if (array[i] > min){
                min = array[i];
            }
        }

        return new int[] { min, mid, max };
    }
}
