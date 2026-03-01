import java.util.HashSet;

public class containDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        HashSet<Integer> set = new HashSet<>();

        for(int res : arr){
            if(set.contains(res)){
                System.out.println("Contain Duplicate");
                break;
            } set.add(res);
        }
    }
}
