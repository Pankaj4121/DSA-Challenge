package Easy_Level;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 8;
        int i = 0;
        int j = arr.length - 1;
        boolean found = false;
        while(i < j){
            int sum = arr[i] + arr[j];
                if(sum == target){
                    System.out.println(i + " " + j);
                    found = true;
                    break;
                } else if (sum > target) {
                    j--;
                } else{
                     i++;
                }
        }
        if(!found){
            System.out.println("No Pair found");
        }
    }
}
