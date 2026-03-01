package Screenshot;

public class moveZero {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,4,0};
        int nonZero=0;
        for(int zero=0; zero<arr.length; zero++){
            if(arr[zero] != 0){
                arr[nonZero] = arr[zero];
                nonZero++;
            }
        }
        while (nonZero < arr.length){
            arr[nonZero] = 0;
            nonZero++;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
