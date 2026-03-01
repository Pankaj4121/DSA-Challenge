package Stream_Q.String;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfEachWord {
    public static void main(String[] args) {
        String str = "java is good and java is powerful";
        Map<String, Long> ans = Arrays.stream(str.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(ans);
    }
}
