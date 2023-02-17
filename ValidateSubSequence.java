import java.util.List;

public class ValidateSubSequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int arrayIdx = 0;
        int sequenceIdx = 0;

        while (arrayIdx < array.size() && sequenceIdx < sequence.size()){
            if (array.get(arrayIdx) == sequence.get(sequenceIdx)){
                sequenceIdx++;
            }
            arrayIdx++;
        }

        return sequenceIdx == sequence.size();
    }
}
