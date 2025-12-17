public class LongestPalindromicSubString {
    public static void main(String[] args){
        String s = "babad";
        String str = LongestSubString(s);
        System.out.println(str);

    }

    public static String LongestSubString(String s){
        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int left = i;
            int right = i;

            // handle duplicate center characters
            while(left >= 0 && s.charAt(left) == c){
                left--;
            }
            while(right < s.length() && s.charAt(right) == c){
                right++;
            }

            // expand around center
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            left++;  // step back to valid index

            if(end - start < right - left){
                start = left;
                end = right;
            }
        }
        return s.substring(start, end);
    }
}
