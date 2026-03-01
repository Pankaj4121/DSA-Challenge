package Easy_Level;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        String reversed = "";
        for(int i=0; i<s.length(); i++){
            reversed += s.charAt(i);
        }
        if(s.equals(reversed)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
}
