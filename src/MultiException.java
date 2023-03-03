

public class MultiException {
    public static void main(String[] args) {

        try {
            getDiv(4,null);
        }
        catch (ArithmeticException exp1){
            System.out.println("Division by zero exception");
        }
        catch (NullPointerException exp2) {
            System.out.println("Enter something");
        }


    }
    private static void getDiv (Integer x, Integer y){
        System.out.println(x/y);
    }
}



