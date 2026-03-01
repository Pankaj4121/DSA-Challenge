package Stream_Q.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllPalindromicWords {
    public static void main(String[] args) {
        String str = "madam level java racecar code";
        List<String> ans = Arrays.stream(str.split("\\s+"))
                .filter(word -> word.equals(
                        new StringBuilder(word).reverse().toString()
                ))
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
