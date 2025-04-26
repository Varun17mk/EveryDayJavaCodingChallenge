package Arrays;

import java.util.Arrays;

public class EqualityOf2Arrays {
    public static void main(String[] arg){
        // Check whether given 2 arrays are equal or not

        // Approach 1. Using Arrays.equals method

        int[] a1={1,2,3,45,5};
        int[] a2={1,2,3,4,5};

//        boolean status = Arrays.equals(a1,a2);
//
//        if(status==true){
//            System.out.println("Given arrays are Equal");
//        }
//
//        else{
//            System.out.println("Given arrays are not Equal");
//        }

        // Approach 2. Without Using Arrays.equals method
        boolean status = true;

        if(a1.length!=a2.length){
            System.out.println("The given Arrays are not equal");
        }
        else {
            for (int i = 0; i < a1.length; i++) {
                if(a1[i]!=a2[i]){
                    status = false;
                }
            }
        }
        if (status){
            System.out.println("The given Arrays are equal");
        }
        else System.out.println("The given Arrays are not equal");
    }
}
