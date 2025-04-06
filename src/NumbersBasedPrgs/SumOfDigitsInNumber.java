package NumbersBasedPrgs;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        long L2 = 1597534682;
        long sumOfDigits = 0;
        while(L2!=0){
            sumOfDigits+= L2%10; //extracting last digit and adding it to sumOfDigits.
            L2 = L2/10;  // eliminating last digit.
        }
        System.out.println("The sum of all digits is: "+sumOfDigits);
    }
}
