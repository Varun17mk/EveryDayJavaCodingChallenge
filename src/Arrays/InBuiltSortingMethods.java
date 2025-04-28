package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class InBuiltSortingMethods {

    public static void main(String[] args) {
        int[] arr = {10, 40, 50, 30, 20};

        // Approach 1 using .parallelsort
//        Arrays.parallelSort(arr);
//        System.out.println("After sorting, Array is : "+Arrays.toString(arr));

        // Approach 2 using .sort
        Arrays.parallelSort(arr);
        System.out.println("After sorting, Array is : " + Arrays.toString(arr));

        // In Reverse Order
        Integer a[] = {10, 30, 20, 60, 50};
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("After reverse sorting, Array is : " + Arrays.toString(a));
    }
}
