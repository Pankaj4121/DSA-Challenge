package Stream_Q.Hot20;

import java.util.Arrays;
import java.util.List;

public class CheckIfAllElementsMatchAConditionAllMatch {
    public static void main(String[] args) {
        List<Integer> ls1 = Arrays.asList(1,2,3,4,5);
        boolean result = ls1.stream()
                .allMatch(x -> x % 2 == 0);
        System.out.println(result);
    }
}
