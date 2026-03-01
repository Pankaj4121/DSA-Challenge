package Stream_Q.Hot20;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int min = Arrays.stream(arr).min().getAsInt();
        int min2 = Arrays.stream(arr).boxed().min(Comparator.comparingInt(x->x)).get();
        int min3 = Arrays.stream(arr).boxed().min(Integer::compareTo).get();
        System.out.println(min + " " + min2 + " " + min3);

        int max = Arrays.stream(arr).max().getAsInt();
        int max1 = Arrays.stream(arr).boxed().max(Comparator.comparingInt(x-> x)).get();
        int max2 = Arrays.stream(arr).boxed().max(Integer::compareTo).get();
        System.out.println(max + " " + max1 + " " + max2);
    }
}
