package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 0, -2, 3, 4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }

    public static List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);             // [-2, -1, 0, 0, 3, 4]

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;   //remove first duplicate

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    while (left < right && arr[left] == arr[left + 1]) {         // Skip Duplicate
                        left++;
                    }

                    while (right > left && arr[right] == arr[right - 1]) {    //Skip Duplicate
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}