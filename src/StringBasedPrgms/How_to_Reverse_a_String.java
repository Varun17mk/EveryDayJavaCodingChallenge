package StringBasedPrgms;

public class How_to_Reverse_a_String {

    public static void main(String[] args) {
        //1. Using traditional for loop
        // String is immutable.
        String str = "Hey Varun";
        int strlength = str.length();
        System.out.println(strlength); // 9 includes spaces as well.
        String revStr = "";

        for(int i = strlength -1; i>=0; i--){
            revStr= revStr + str.charAt(i);
        }
        System.out.println("Reversed String is : "+revStr);

        //2. Using StringBuffer
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reversed String using StringBuffer  : "+sb.reverse());
    }
}
