package NumbersBasedPrgs;

public class PrimeCheck {
    public static void main(String[] args){
        // Method 1 using count
//        int num=2;
//        int count=0;
//
//        if(num!=0){
//            for(int i=1;i<=num;i++){
//                if(num%i==0){
//                    count++;
//                }
//            }
//            if(count==2){
//                System.out.println(num+" is a prime number");
//            }
//            else{
//                System.out.println(num+" is a not prime number");
//            }
//        }
//        else {
//            System.out.println("Not a Prime Number");
//        }

        //-------------------------------------------------------------------

        // Method 2 without using count

        int n = 47;

        if(n>1){
            boolean flag= false;
            for(int i=2; i<n/2; i++){
                if(n%i==0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(n+" : Its a prime number");
            }
            else System.out.println(n+" : Its not a prime number");
        }
        else System.out.println(n+" : Its not a prime number");

    }
}
