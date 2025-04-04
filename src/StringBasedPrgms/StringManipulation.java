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
        System.out.println(str.substring(0,9));

        //trim
       String str2 = "   Hey GULBARGA  ";
        System.out.println(str2.trim());

        //replace
        System.out.println(str2.replace(" ",""));  // replace white spaces into nospaces

        String date = "17/10/2000";
        System.out.println(date.replace("/","-"));  // replace "/" into "-"

        //split

        String test = "Hello_World_Test_Selenium";
        String testValue[] = test.split("_");
        // to print array use for loop
        for (String testArr : testValue) {
            System.out.println(testArr);
        }


        //concatenate  Important for interview
        String x = "Hey";
        String y = "Varun";
        int a = 100;
        int b = 200;

        System.out.println(x+y); //"HeyVarun"
        System.out.println(a+b); //300 is what we get
        System.out.println(x+y); //"HeyVarun100200"
        System.out.println(a+b+x+y); // "300HeyVarun"
        System.out.println(x+y+(a+b)); //"HeyVarun300"


    }
}
