package NumbersBasedPrgs;

public class NumberOfEvenAndOddDigits {
    public static void main(String[] args) {
        long L1 = 1234666789;
        long num = 0;
        int evenCount = 0;
        int oddCount= 0;

        while(L1!=0){
            num = L1%10;
            if(num%2==0){
                System.out.println("Even digit is : "+num);
                evenCount++;
            }else {
                System.out.println("Odd digit is : "+num);
                oddCount++;
            }
            L1 = L1/10;
        }

        System.out.println("Even Digits in given number are : "+evenCount);
        System.out.println("Odd Digits in given number are : "+oddCount);
    }
}
