package Stream_Q.String;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSecondMostRepeatedCharacter {
    public static void main(String[] args) {
        String str = "Repeated";
        String ans = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .skip(1)
                .map(e -> e.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(ans);


    }
}
