package Stream_Q.String;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {
        String str = "madam level java racecar code";
        Map<Integer, List<String>> ans = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(String::length));
        System.out.println(ans);
    }
}
