package NumbersBasedPrgs;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        long num1 = 1234561234;
        long numCount=0;
        while(num1!=0){
            num1 = num1/10;  // '/' eliminates the last digit
            numCount++;
        }

        System.out.println("The number of digits in given integer is : "+numCount);
    }
}
