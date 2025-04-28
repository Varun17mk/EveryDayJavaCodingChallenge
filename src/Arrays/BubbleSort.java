package Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        // Printing array
        System.out.println("Arrays before sorting "+Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[j]>arr[j+1]){
                    // Swapping logic using temp
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // Printing Sorted array
        System.out.println("Arrays after sorting "+Arrays.toString(arr));

    }
}
