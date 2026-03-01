package Stream_Q.Hot20;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int ans = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println(ans);

                
    }
}
