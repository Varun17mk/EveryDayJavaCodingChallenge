package StringBasedPrgms;

public class CountCharacterOccurance {
    public static void main(String[] args) {
        // 1. Approach - 1
        String str = "Java is a OOP Language";
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("The occurrence of 'a' is : " + count);


        // Approach 2

        int count2 = 0;
        int totalCount = str.length();

        int totalCountAfterRemoval = str.replace("J", "").length();

        count2 = totalCount - totalCountAfterRemoval;
        System.out.println("The occurrence of 'J' is : " + count2);
    }
}
