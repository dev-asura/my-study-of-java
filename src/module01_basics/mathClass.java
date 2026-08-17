package module01_basics;

public class mathClass {
    public static void main(String[] args) {

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        double result;

        result = Math.pow(2, 10);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14); // round it up (next integer number)
        result = Math.floor(3.99); // round it down (integer too)
        result = Math.max(10, 30); // the maximum value between this two
        result = Math.min(10, 30); // the minimum value between this two

        System.out.println(result);
    }
}
