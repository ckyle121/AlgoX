import java.util.Arrays;
import java.util.List;

public class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int minChange = 0;

        for (int i = 0; i < coins.length; i++){
            if (coins[i] > minChange + 1){
                return minChange + 1;
            }
            minChange += coins[i];
        }

        return minChange + 1;
    }
}
