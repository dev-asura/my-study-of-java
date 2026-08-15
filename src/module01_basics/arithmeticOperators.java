package module01_basics;

public class arithmeticOperators {
    public static void main(String[] args) {

        // Arithmetic Operators
         int x = 10;
         int y = 3;
         int z;

         z = x + y;
         System.out.println(z);
         z = x - y;
         System.out.println(z);
         z = x * y;
         System.out.println(z);
         z = x / y;
         System.out.println(z);
         z = x % y;
         System.out.println(z);


        // Augmented Assignment Operators
         int t = 10;
         int v = 2;

         t = t + v;
         t += v;
         t -= v;
         t *= v;
         t /= v;
         t %= v;
         System.out.println(t);


        // Increment and Decrement Operators
         int c = 1;
         int j = 10;

         c = c + 1;
         c += 1;
         c++;
         c++;

         j -= 1;
         j--;
         j--;

        System.out.println(c);
        System.out.println(j);


        // Order of Operations [P-E-M-D-A-S]
        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);
    }
}
