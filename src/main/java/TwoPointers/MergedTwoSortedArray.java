package TwoPointers;

public class MergedTwoSortedArray {
    public static void main(String[] args){
        int[] arr1 = {1,4,7,8};
        int[] arr2 = {2,3,5,9};
        int n = arr1.length;
        int m = arr2.length;
        int[] res = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;

        while( i < n && j < m ){
            if(arr1[i] < arr2[j]){
                res[k] = arr1[i];
                i++;
                k++;
            } else {
                res[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < n){
            res[k++] = arr1[i++];
        }
        while(j < m){
            res[k++] = arr2[j++];
        }
        for(int ans : res){
            System.out.print(ans + " ");
        }


    }

}
