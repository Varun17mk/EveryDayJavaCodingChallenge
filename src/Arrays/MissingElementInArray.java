package Arrays;

public class MissingElementInArray {

    public static void main(String[] args) {
        // Array should not have duplicates
        //Array no need to be sorted
        // Values shd be in range

        int[] a={1,2,3,4,6,7,8};

        //1+2+3+4+6+7+8 = sum1
        //1+2+3+4+5+6+7+8 = sum2
        // sum2-sum1 = Missing element/number

        int sum1=0;
        for (int i=0; i<a.length;i++){
            sum1= sum1 + a[i];
        }

        System.out.println("The sum of elements in Array : "+sum1);

        int sum2=0;
        for (int i=1; i<=8;i++){
            sum2= sum2 + i;
        }
        System.out.println("The sum of range of elements in Array : "+sum2);

        int missingNumber;
        missingNumber = sum2-sum1;

        System.out.println("Missing number is : "+missingNumber);
    }
}
