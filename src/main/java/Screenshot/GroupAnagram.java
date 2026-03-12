package Screenshot;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] str = {"cat", "bat", "sat", "tac"};

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : str){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);

        }
        System.out.println(map.values());

//        Using Stream API
        Map<String, List<String>> ans = Arrays.stream(str).collect(Collectors.groupingBy(
                x -> {
                    char[] ch = x.toCharArray();
                    Arrays.sort(ch);
                    return new String(ch);
                }));
        System.out.println(ans.values());

    }
}
