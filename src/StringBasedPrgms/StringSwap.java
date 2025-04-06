package StringBasedPrgms;

public class StringSwap {
    public static void main(String[] args) {
        String a = "Good";
        String b = "morning";

        System.out.println("Before swapping...");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        //1. append a and b.
        a=a+b; //"Goodmorning"

        //2. Store initial string a in string b
        b=a.substring(0,a.length()-b.length());

        // store initial string of b in string a
        a=a.substring(b.length());
        System.out.println("After swapping...");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
