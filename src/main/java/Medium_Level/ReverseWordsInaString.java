package Medium_Level;

public class ReverseWordsInaString {
    public static void main(String[] args) {
        String s = "  the sky   is blue  ";
        s = s.trim();
        String[] word = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=word.length - 1; i>=0; i--){
            if(!word[i].equals("")){
                result.append(word[i]).append(" ");
            }
        }
        System.out.println(result);
    }
}
