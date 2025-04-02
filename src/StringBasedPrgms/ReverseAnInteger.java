package StringBasedPrgms;

public class ReverseAnInteger {
    public static void main(String[] args) {
        int num = 12345;
        int revNum = 0;

        //1. Using algo
        while (num != 0) {
            revNum = revNum * 10 + num % 10;  // num%10 extracts last digit from num.
            num = num / 10;  // num/10 eliminates last digit on every iteration.
        }
        System.out.println("Reversed Integer is : " + revNum);

        //2. Using StringBuffer
        int num1 = 123456;
        StringBuffer sb = new StringBuffer(String.valueOf(num1)); //String.valueOf converts int value to string so that we can perform reverse action.
        System.out.println("Reversed Integer is Using StringBuffer : " + sb.reverse());

    }
}
