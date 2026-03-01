package Stream_Q.String;

import java.util.Arrays;

public class CountNumberOfWordsInAStringUsingStreams {
    public static void main(String[] args) {
        String str = "madam level java racecar code";
        long count = Arrays.stream(str.split(" "))
                .count();
        System.out.println(count);
    }
}
