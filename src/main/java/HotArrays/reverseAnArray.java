package HotArrays;

import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
//      #Two Pointers
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));

//        #By new Array
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] ans = new int[arr1.length];
        int j=0;
        for(int i=arr1.length-1; i>=0; i--){
            ans[j] = arr1[i];
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
