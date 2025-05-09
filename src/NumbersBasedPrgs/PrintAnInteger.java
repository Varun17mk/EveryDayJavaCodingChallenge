package NumbersBasedPrgs;

import java.util.Scanner;

public class PrintAnInteger {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = reader.nextInt();

        System.out.println("Entered number : "+num);
    }
}
