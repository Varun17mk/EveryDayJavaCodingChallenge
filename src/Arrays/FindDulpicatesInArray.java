package Arrays;

import java.util.HashSet;

public class FindDulpicatesInArray {
    public static void main(String[] args) {

        // Approach 1
        String[] arr = {"Varun","Varsha","VArun","Chaya","Madhvesh","Varun","Varsha"};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int count = 0;
                if(arr[i]==arr[j]) {
                    flag=true;
                    count++;
                    System.out.println(arr[i]+" has "+count+" duplicates");
                }
            }
        }
        if (flag==false){
            System.out.println("No duplicates found");
        }

        //Approach 2:
        // Using HashSet
        // HashSet donot allow addition of duplicate values
        HashSet<String> hashSet = new HashSet<String>();

        // remember...
        // if System.out.println(hashset.add("Varun")); = returns true
        // again System.out.println(hashset.add("Varun")); = returns false as "Varun" is already in

        boolean flag2= true;
        for(String l : arr){
            if(hashSet.add(l)==false){
                System.out.println(l+" has duplicate");
                flag2 = false;
            }
        }
        if (flag2){
            System.out.println("No Duplicates found");
        }

    }
}
