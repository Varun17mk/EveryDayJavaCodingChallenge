package NumbersBasedPrgs;

public class PrimeBetweenInterval {
    public static void main(String[] args) {
        // Find prime numbers within number range
        int low = 20;
        int high = 50;

        while (low<high)
        {
            boolean flag = false;
            for (int i=2; i<low/2; i++){
                if(low%i==0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.print(low + " ");
            }
            low++;
        }

    }
}
