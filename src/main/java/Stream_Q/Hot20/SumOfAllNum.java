package Stream_Q.Hot20;

import java.util.Arrays;

public class SumOfAllNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum1 = Arrays.stream(arr)
                .sum();
        System.out.println(sum1);

        int sum2 = Arrays.stream(arr)
                .reduce(0, (a,b) -> a + b);
        System.out.println(sum2);
    }
}
