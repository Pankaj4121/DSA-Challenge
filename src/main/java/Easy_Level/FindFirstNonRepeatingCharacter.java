package Easy_Level;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String ch = "abcbdbc";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<ch.length(); i++){
            char c = ch.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i=0; i<ch.length(); i++){
            char cp = ch.charAt(i);
            if(map.get(cp) == 1){
                System.out.println("First Non Repeated Char : " + cp);
                break;
            }
        }
    }
}
