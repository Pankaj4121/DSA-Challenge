package Stream_Q.String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeFirstLetterOfEachWord {
    public static void main(String[] args) {
        String str = "capitalize first letter of each word";
        String ans = Arrays.stream(str.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
        System.out.println(ans);
    }
}
