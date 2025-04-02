package StringBasedPrgms;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "The rains have started here selenium";
        // Printing length
        System.out.println(str.length());

        //charAt function
        System.out.println(str.charAt(5));

        //1st occurrence of 's'
        System.out.println(str.indexOf('s'));

        //2nd occurrence of 's'
        System.out.println(str.indexOf('s',str.indexOf('s')+1));

        //3rd occurrence of 's'
        System.out.println(str.indexOf('s',str.indexOf('s',str.indexOf('s')+1)+1));

        System.out.println(str.indexOf("have"));

        //if desired String is not found it will return -1
        System.out.println(str.indexOf("hey")); // returns -1

        //String comparison
        String str1 = "The rains Have started here selenium";
        System.out.println(str.equals(str1)); //case sensitive

        System.out.println(str.equalsIgnoreCase(str1));

        //SubString
    }
}
