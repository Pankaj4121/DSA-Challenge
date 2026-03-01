package Stream_Q.Hot20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirstNElementsAndCollectRemaining {
    public static void main(String[] args) {
        List<Integer> ls1 = Arrays.asList(1,2,3,4,5);
        List<Integer> ans = ls1.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
