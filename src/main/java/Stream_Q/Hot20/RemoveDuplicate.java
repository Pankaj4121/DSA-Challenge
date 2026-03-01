package Stream_Q.Hot20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,5};
        List<Integer> ans = Arrays.stream(arr)
                .boxed()
                .sorted()
                .distinct().collect(Collectors.toList());
        System.out.println(ans);

    }
}
