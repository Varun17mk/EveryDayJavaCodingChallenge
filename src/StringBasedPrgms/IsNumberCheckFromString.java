package StringBasedPrgms;

public class IsNumberCheckFromString {
    public static void main(String[] args) {
        isNumber("123567890");
        isPhoneNumber("789456123");
        isPhoneNumber("1234567890");
        isCreditCardNumber("1234567890123456");
    }

    // Checking if the String contains only number or not!!
    public static boolean isNumber(String number){
        try{
            Long.parseLong(number);
            System.out.println(number+" : This is a valid Number");
            return true;
        }
        catch (NumberFormatException e){
            System.out.println(number+" : Not a valid number");
            return false;
        }
    }

    // Checking if String is number and contains only 10-digits used as PhoneNumber
    public static void isPhoneNumber(String number){
        if(number.length()==10 && isNumber(number)){
            System.out.println(number+" : Its a Valid Phone Number");
        }
        else System.out.println(number+" : Its not a Valid Phone Number");
    }

    // Checking if String is number and contains only 16-digits used as CreditCardNumber
    public static void isCreditCardNumber(String number){
        if(number.length()==16 && isNumber(number)){
            System.out.println(number+" : Its a Valid Credit Card Number");
        }
        else System.out.println(number+" : Its not a Credit Card Number");
    }

}
