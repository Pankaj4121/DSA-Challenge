package Easy_Level;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        leftRotate(arr, 5,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void leftRotate(int[] arr, int n, int k){
        rev(arr, 0, k-1);
        rev(arr, k, n-1);
        rev(arr, 0, n-1);
    }
    public static void rev(int[] arr, int start, int last){
        while(start < last){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }

    }
}
