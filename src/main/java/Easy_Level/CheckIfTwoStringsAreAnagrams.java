package Easy_Level;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "tensil";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)){
            System.out.println("Yes Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}
