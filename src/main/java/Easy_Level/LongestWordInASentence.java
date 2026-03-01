package Easy_Level;

public class LongestWordInASentence {
    public static void main(String[] args) {
        String s = "Working at abroad";
        String[] arr = s.split("\\s+");
        String longest = "";
        for(String words : arr){
            if(words.length() > longest.length()){
                longest = words;
            }
        }
        System.out.println(longest);
    }
}
