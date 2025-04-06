package NumbersBasedPrgs;

public class PalindromeNumberCheck {
    public static void main(String[] args){
        int originalNum = 12321;
        int originalNum1 = originalNum;
        // Logic is to reverse the number and check if the reversed integer is same of original one,
        // if yes its a palindrome number

        int revNum=0;

        while(originalNum!=0){
            revNum = revNum*10 + originalNum%10;
            originalNum = originalNum/10;
        }

        System.out.println("Reversed Integer is : "+revNum);

        if(revNum == originalNum1){
            System.out.println("Hurray given number is a Palindrome");
        }
        else System.out.println("Oops given number is not a Palindrome ");

    }
}
