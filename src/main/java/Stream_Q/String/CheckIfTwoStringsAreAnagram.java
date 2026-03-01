package Stream_Q.String;

import java.util.stream.Collectors;

public class CheckIfTwoStringsAreAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean result = s1.length() == s2.length() &&
                s1.chars().sorted()
                        .boxed()
                        .collect(Collectors.toList())
                        .equals(
                                s2.chars().sorted()
                                        .boxed()
                                        .collect(Collectors.toList())
                        );
        System.out.println(result);
    }
}
