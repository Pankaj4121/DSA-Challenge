package Stream_Q.String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortCharOfString {
    public static void main(String[] args) {
        String str = "Sorting";

        String ans = str.chars()
                .sorted()
                .mapToObj(x -> String.valueOf((char) x))
                .collect(Collectors.joining());
        System.out.println(ans);

    }


}
