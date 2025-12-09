package TwoPointers;

import java.util.Arrays;
import java.util.HashMap;


public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;

        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(nums, target);
        int[] result2 = ts.twoSum2(nums, target);
        int[] result3 = ts.twoSum3(nums, target);

        System.out.println(result[0] + " " + result[1]);
        System.out.println(result2[0] + " " + result2[1]);
        System.out.println(result3[0] + " " + result3[1]);

    }

    //Brute Force Approach : Time Complexity - n*n, Space -
    public int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //Better Approach - Time Complexity - o(n), Space - o(n)
    public int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }

    //Optimized Approach - Two Pointer : time complexity - nlogn, Space - o(1)
    public int[] twoSum3(int[] nums, int target){
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            if(nums[i] + nums[j] == target){
                return new int[]{i, j};
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1,-1};
    }

}
