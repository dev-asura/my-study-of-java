package module01_basics;

public class variableScope {

    static int x = 3; //CLASS no usages

    public static void main(String[] args) {

        // Variable Scope = where a variable can be accessed

        int x = 1; //LOCAL

        System.out.println(x);
        doSomething();
    }
    static void doSomething(){
        int x = 2; //LOCAL

        System.out.println(x);
    }
}
