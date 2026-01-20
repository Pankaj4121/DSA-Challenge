package HotArrays;

public class findLargestnSmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int smallest = 0;
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            } else {
                largest = arr[i];
            }
        }
        System.out.println("Smallest : " + smallest);
        System.out.println("Largest : " + largest);
    }
}
