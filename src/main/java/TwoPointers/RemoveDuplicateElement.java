package TwoPointers;

public class RemoveDuplicateElement {
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,4};
        int i = 0;
        int j = 1;
        int n = arr.length;
        while(j < n){
            if(arr[j] == arr[j - 1]){
                j++;
                continue;
            } else {
                arr[i + 1] = arr[j];
                i++;
                j++;
            }
        }

        for(int p=0; p<=i; p++){
            System.out.println(arr[p]);
        }
    }
}
