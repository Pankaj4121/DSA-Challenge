package Screenshot;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = 5;
        int expectedResult = n * (n + 1) / 2;
        int actualResult = 0;

        for(int i=0; i<arr.length; i++){
            actualResult += arr[i];
        }
        System.out.println(expectedResult - actualResult);
    }
}
