package NumbersBasedPrgs;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        // An Armstrong number (also known as a narcissistic number, pluperfect number, or pluperfect digital invariant)
        // is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
        // eg : 153 = 1*1*1 + 5*5*5+ 3*3*3 = 153, 153 is Armstrong number.

        int num = 371;
        int actualNum = num;
        double result = 0;
        double digitsCount = String.valueOf(num).length(); // calculates number of digits in given number.

        while (actualNum!=0){
            int n = actualNum%10;
            result = result + Math.pow(n,digitsCount);
            actualNum = actualNum/10;
        }

        if(num==result){
            System.out.println(num+" : is a Armstrong number");
        }
        else System.out.println(num+" : is not a Armstrong number");
    }
}
