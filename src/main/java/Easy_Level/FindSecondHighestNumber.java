package Easy_Level;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        int[] arr = {3,9,7,5,2};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            } else if (second_max < arr[i] && max != arr[i]) {
                second_max = arr[i];
            }
        }
        System.out.println(second_max);
    }
}
