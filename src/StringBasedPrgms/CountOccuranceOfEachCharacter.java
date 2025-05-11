package StringBasedPrgms;

import java.util.HashMap;

public class CountOccuranceOfEachCharacter {
    public static void main(String[] args) {

        getCharCount("Varun");
        getCharCount("Hey my name is Varun kulkarni");
        getCharCount("Automation testing is fun!!");
    }

    public static void getCharCount(String name) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] strArray = name.toCharArray();
        for (char c : strArray) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        System.out.println( name+" : "+charMap);
    }
}
