package Stream_Q.String;

public class CountVowelsInAString {
    public static void main(String[] args) {
        String str = "Count Vowels";
        long ans = str.toLowerCase()
                .chars()
                .filter(x -> "aeiou".indexOf(x) != -1 )
                .count();
        System.out.println(ans);
    }
}
