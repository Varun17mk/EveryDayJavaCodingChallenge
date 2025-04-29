package StringBasedPrgms;

import java.util.Scanner;

public class CountWordsInAString {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("The total number of words in given String : "+count);
    }
}
