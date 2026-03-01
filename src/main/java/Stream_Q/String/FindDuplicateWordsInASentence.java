package Stream_Q.String;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWordsInASentence {
    public static void main(String[] args) {
        String str = "java is good and java is powerful";
        List<String> ans = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
