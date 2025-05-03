package StringBasedPrgms;

import java.text.DecimalFormat;

public class Percentage_of_Uppercase_LowerCase_SpecialCharacters {
    public static void main(String[] args) {
       /*  Find the Percentage of LowerCase, UpperCase and Character in String

        In String "Er. Varun Kulkarni 123456!@#$"
        UpperCase = 10.71%
        Lowercase = 60.71%
        Digits = 10.71%
        Special Characters = 17.86%

         */

        getCharPercentage("Er. Varun Kulkarni 123456!@#$");
        getCharPercentage("Varun");

    }

    public static void getCharPercentage(String str){
        int strL = str.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int specialChars = 0;

        for (int i = 0; i < strL; i++) {
            char ch = str.charAt(i);

            if(Character.isLowerCase(ch)){
                lowerCase++;
            } else if (Character.isUpperCase(ch)) {
                upperCase++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else {
                specialChars++;
            }
        }

        double upperCasePercentage = (double) (upperCase * 100) /strL;
        double lowerCasePercentage = (double) (lowerCase * 100) /strL;
        double digitsPercentage = (double) (digits * 100) /strL;
        double specialCharsPercentage = (double) (specialChars * 100) /strL;

        DecimalFormat formater = new DecimalFormat("##.##");

        System.out.println(" In given String : "+str);
        System.out.println(" UpperCase% --> : "+formater.format(upperCasePercentage));
        System.out.println(" LowerCase% --> : "+formater.format(lowerCasePercentage));
        System.out.println(" Digits% --> : "+formater.format(digitsPercentage));
        System.out.println(" SpecialChars% --> : "+formater.format(specialCharsPercentage));
        System.out.println("----------------------------------------------------------");
    }
}
