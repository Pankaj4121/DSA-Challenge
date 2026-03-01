package Stream_Q.Hot20;

import java.util.*;
import java.util.stream.Collectors;

public class FlattenNestedListsUsingFlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );
        System.out.println(list);

        List<Integer> ans = list.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(ans);

    }
}
