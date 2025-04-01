package StringBasedPrgms;

public class Remove_Junk_Characters {
    //What is a Regular Expression?
    //A regular expression is a sequence of characters that forms a search pattern.
    // When you search for data in a text, you can use this search pattern to describe what you are searching for.
    //A regular expression can be a single character, or a more complicated pattern.
    //
    //Regular expressions can be used to perform all types of "text search" and "text replace operations".
    public static void main(String[] args){
        String s="Hey !@#$% Varun*() 1324567891235*-++";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

    }
}
