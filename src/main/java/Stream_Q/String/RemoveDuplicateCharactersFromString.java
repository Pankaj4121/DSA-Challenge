package Stream_Q.String;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class RemoveDuplicateCharactersFromString {
    public static void main(String[] args) {
        String str = "Dupllicatee";
        String ans = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());

        System.out.println(ans);
    }
}
