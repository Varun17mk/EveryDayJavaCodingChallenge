package Arrays;

public class MinAndMaxValueInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,60,50,30,80,100};
        int maxValue =arr[0];

        for (int i=1; i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("The Maximum Value is an array : "+maxValue);

        int minValue = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]< minValue){
                minValue = arr[i];
            }
        }
        System.out.println("The Minimum Value is an array : "+minValue);
    }
}
