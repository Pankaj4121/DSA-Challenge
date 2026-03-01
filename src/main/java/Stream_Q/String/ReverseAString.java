package Stream_Q.String;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Reversed";
        String ans = new StringBuilder(str)
                .reverse()
                .toString();
        System.out.println(ans);
    }
}
