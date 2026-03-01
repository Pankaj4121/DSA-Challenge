package Screenshot;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 18;
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(left + " " + right);
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
