package Stream_Q.Hot20;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupElementsAndCountThem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,2,5};
        Map<Integer, Long> ans = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(ans);
    }
}
