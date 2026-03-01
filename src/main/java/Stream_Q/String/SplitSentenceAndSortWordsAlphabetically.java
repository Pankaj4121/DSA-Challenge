package Stream_Q.String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SplitSentenceAndSortWordsAlphabetically {
    public static void main(String[] args) {
        String str = "banana apple mango orange";
        String result = Arrays.stream(str.split("\\s+"))
                .sorted()
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
