package NumbersBasedPrgs;

public class LeapYearCheck {

    // A Year is Leap Year if
    // 1. Its not a century year and its completely divisible by 4.
    // 2. If its a Century year, it shd be completely divisible by 400

    public static void main(String[] args) {
        int year = 2012;

        boolean leap = false;

        if (year % 4 == 0) {
            leap=true;
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else leap = false;
            }
        } else {
            leap = false;
        }

        if (leap) {
            System.out.println(year + " : This is Leap Year");
        } else System.out.println(year + " : This is not Leap Year");

    }

}
