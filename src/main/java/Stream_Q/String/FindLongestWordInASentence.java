package Stream_Q.String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FindLongestWordInASentence {
    public static void main(String[] args) {
        String str = "Find longest word in a sentence";
        String word = Arrays.stream(str.split(" "))
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println(word);
    }
}
