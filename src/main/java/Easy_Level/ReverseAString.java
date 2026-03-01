package Easy_Level;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "reverse";
        String ans = "";
        for (int i = s.length()-1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        System.out.println(ans);
    }
}
