package Easy_Level;

import java.util.HashMap;

public class FindFrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,4,5,6,6};
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
    }
}
