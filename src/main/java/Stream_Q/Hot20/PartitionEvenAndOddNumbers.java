package Stream_Q.Hot20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenAndOddNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Map<Boolean, List<Integer>> result = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        List<Integer> even = result.get(true);
        List<Integer> odd = result.get(false);

        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);

    }
}
