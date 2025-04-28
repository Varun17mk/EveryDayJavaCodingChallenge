package Arrays;

public class LinerSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int TargetElement = 40;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(TargetElement==arr[i]){
                System.out.println("The Target element "+TargetElement+" is present in given array");
                flag = true;
                break;
            }
        }
        if(flag==false){
            System.out.println(" The Target element "+TargetElement+" is not present in given array");
        }
    }
}
