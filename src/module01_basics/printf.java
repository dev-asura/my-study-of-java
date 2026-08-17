package module01_basics;

public class printf {
    public static void main(String[] args) {
        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

        // %s
        String name = "Spongebob";

        // %c
        char firstLetter = 'S';

        // %d
        int age = 30;

        // %f
        double height = 60.5;

        // %b
        boolean isEmployed = true;

        System.out.printf("Hello %s.\n", name);
        System.out.printf("Your name starts with a %c.\n", firstLetter);
        System.out.printf("You're %d years old.\n", age);
        System.out.printf("You're %f inches tall.\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old.\n", name, age);

        System.out.println("#######################################################");

        // ------------------------------------------------------------------------

        // [flags]

        // + = output plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

        //System.out.printf("%+,.2f\n", price1);
        //System.out.printf("%+,.2f\n", price2);
        //System.out.printf("%+,.2f\n", price3);

        System.out.println("#######################################################");

        // ------------------------------------------------------------------------

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        //System.out.printf("%04d\n", id1);
        //System.out.printf("%04d\n", id2);
        //System.out.printf("%04d\n", id3);
        //System.out.printf("%04d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
