package Stream_Q.Hot20;

import java.util.Comparator;
import java.util.List;

public class FindLongestString {
    public static void main(String[] args) {
        List<String> str = List.of("I", "Got", "Offer");
        String ans = str.stream()
                .max(Comparator.comparing(String::length))
                .orElse(" ");
        System.out.println(ans);
    }
}
