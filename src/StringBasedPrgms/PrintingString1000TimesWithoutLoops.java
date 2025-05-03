package StringBasedPrgms;

public class PrintingString1000TimesWithoutLoops {
    public static void main(String[] args) {
        String str = "Varun";
        String s= "i";
//        // Method 1
//        System.out.println(str.repeat(1000));

        //Method 2
        s=s.replaceAll("i","iiiiiiiiii"); //1i*10 = 10i's
        s=s.replaceAll("i","iiiiiiiiii"); // 10i's10 = 100i's
        s=s.replaceAll("i","iiiiiiiiii"); // 100i's*10 = 1000i's

        s=s.replaceAll("i",str+"\n");
        System.out.println(s);

    }
}
