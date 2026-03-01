package Screenshot;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 2;
        k = k % arr.length;
        rotate(arr, 0, arr.length-1);
        rotate(arr, 0 , k - 1);
        rotate(arr, k, arr.length-1);

        for(int num : arr){
            System.out.print(num + " ");
        }

    }
    public static void rotate(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
