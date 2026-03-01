package Screenshot;

public class maximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i=0; i<nums.length; i++){
            if(currSum < 0){
                currSum = nums[i];
            } else {
                currSum = currSum + nums[i];
            }
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        System.out.println(maxSum);
    }
}
