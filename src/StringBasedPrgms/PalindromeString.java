package StringBasedPrgms;

public class PalindromeString {
    public static void main(String[] args) {

        // 1. Using normal method
        String str1 = "Madam";
        String revStr = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            revStr = revStr + str1.charAt(i);
        }
        System.out.println(" After Reversing the Original String : " + revStr);

        if (revStr.equalsIgnoreCase(str1)) {
            System.out.println(" Given String is a palindrome");
        } else {
            System.out.println(" Given String is not a palindrome");
        }

        // 2. Using StringBuffer

        StringBuffer sb1 = new StringBuffer(str1);

        if(str1.equalsIgnoreCase(String.valueOf(sb1))){
            System.out.println(" Given String is a palindrome");
        }else {
            System.out.println(" Given String is not a palindrome");
        }

    }
}
