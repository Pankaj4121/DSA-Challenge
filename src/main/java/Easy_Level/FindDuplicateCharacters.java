package Easy_Level;

import java.util.HashMap;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String s = "Success";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0; i<s.length(); i++){
            char cp = s.charAt(i);
            if(map.get(cp) == 2){
                System.out.println("Duplicate Char : " + cp);
            }
        }
    }
}

