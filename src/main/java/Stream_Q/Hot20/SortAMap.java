package Stream_Q.Hot20;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortAMap {
    public static void main(String[] args) {
        Map<Integer, Long> map = Map.of(3, 20L, 1, 40L, 2, 10L);

        Map<Integer, Long> ans = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        System.out.println(ans);
    }
}
