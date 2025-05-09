package NumbersBasedPrgs;

public class DivideByZero {
    public static void main(String[] args) {


//        System.out.println(9/0); // Gives Arithmetic Exception.
        System.out.println(9.0/0); //Gives Infinity

        System.out.println(12.78f/0); //Gives Infinity
        System.out.println(10/0.0); //Gives Infinity
        System.out.println(12.333/0.0); //Gives Infinity

        System.out.println(120.12345d/0); //Gives Infinity

//        System.out.println(0/0); // Gives Arithmetic Exception.
        System.out.println(0.0/0); //NaN - Not a Number [null]
        System.out.println(0.0/0.0); //NaN - Not a Number [null]

        // NOTE - If a number involving other than integer, if divided by 0 or 0.0 gets infinty or NaN as result but not arithmetic exception


    }
}
