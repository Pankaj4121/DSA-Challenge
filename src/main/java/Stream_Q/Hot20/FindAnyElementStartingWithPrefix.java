package Stream_Q.Hot20;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyElementStartingWithPrefix {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Spring","Stream","SQL");
        Optional<String> ans = list.stream()
                .filter(s -> s.startsWith("S"))
                .findAny();
        System.out.println(ans.orElse("Not Found"));
    }
}
