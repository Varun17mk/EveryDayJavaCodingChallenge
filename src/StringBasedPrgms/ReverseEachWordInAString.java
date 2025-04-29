package StringBasedPrgms;

public class ReverseEachWordInAString {
    public static void main(String[] args) {
        String str = "Welcome to Java";
        String[] words =  str.split(" ");

        String reverseString = "";
//        // Approach -1 Without using StringBuilder
//        for(String w : words){
//            String reverseWord = "";
//            for (int i=w.length()-1; i>=0;i--){
//                reverseWord = reverseWord+w.charAt(i);
//            }
//            reverseString = reverseString +  reverseWord+" ";
//        }
//        System.out.println(reverseString);



        // Approach - 2 Using StringBuilder
        for(String w : words){
            String reverseWord2 = "";
                StringBuilder sb = new StringBuilder(w);
                sb.reverse();
                reverseWord2 = reverseWord2+sb.toString();
                reverseString = reverseString +  reverseWord2+" ";
        }
        System.out.println(reverseString);
    }
}
