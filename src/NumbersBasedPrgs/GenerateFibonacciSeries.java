package NumbersBasedPrgs;

public class GenerateFibonacciSeries {
    public static void main(String[] arg){
        //Fibonacci Series
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.

        int n1=0;
        int n2=1;
        int sum=0;

        System.out.print(n1+" "+n2);

        for (int i=2;i<10;i++){
            sum = n1 + n2;
            n1=n2;
            n2=sum;

            System.out.print(" "+sum);
        }
    }
}
