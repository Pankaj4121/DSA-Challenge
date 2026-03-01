package Stream_Q.Hot20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAList {
    public static void main(String[] args) {
        int[] arr = {1,4,6,3,5,6};
        List<Integer> asec = Arrays.stream(arr)
                .boxed()
                .sorted()
                .toList();
        System.out.println(asec);

        List<Integer> desc = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(desc);
    }
}
