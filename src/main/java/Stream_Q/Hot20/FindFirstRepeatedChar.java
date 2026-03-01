package Stream_Q.Hot20;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedChar {
    public static void main(String[] args) {
        String str = "Reppeated";
        Character ans = str.toLowerCase()
                .chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(ans);
    }
}
