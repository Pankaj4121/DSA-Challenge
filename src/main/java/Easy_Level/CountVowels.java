package Easy_Level;

public class CountVowels {
    public static void main(String[] args) {
        String s = "asdfgahjkil";
        int vowels=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowels++;
            }
        }
        System.out.println(vowels);
    }
}
