package Medium_Level;

import java.util.HashMap;
import java.util.Map;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        //HashMap Approach
        int[] nums = {1, 3, 4, 2, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
                break;
            }
        }

        //Fast and Slow pointer
        int[] num = {1, 3, 4, 2, 5,5};
        int slow = num[0];
        int fast = num[0];

        do {
            slow = num[slow];
            fast = num[num[fast]];
        } while( slow != fast);

        slow = num[0];
        while (slow != fast){
            slow = num[slow];
            fast = num[fast];
        }
        System.out.println(slow);
    }
}
