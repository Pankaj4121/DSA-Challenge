package Stream_Q.Hot20;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrquencyOfChar {
    public static void main(String[] args) {
        String str = "freQueqncy";
        Map<Character, Long> ans = str.toLowerCase()
                .chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(ans);

    }
}
