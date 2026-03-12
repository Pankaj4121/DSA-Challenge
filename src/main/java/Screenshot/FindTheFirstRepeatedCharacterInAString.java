package Screenshot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheFirstRepeatedCharacterInAString {
    public static void main(String[] args) {
        String str = "Repeated";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.get(ch) == 2){
                System.out.println(ch);
            }
        }
//        using Stream API
        Character ans = str.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 2)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(ans);

    }
}
