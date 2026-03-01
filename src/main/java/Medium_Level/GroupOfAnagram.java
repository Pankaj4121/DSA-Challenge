package Medium_Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupOfAnagram {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            String word = arr[i];
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        System.out.println(map.values());
    }


}
