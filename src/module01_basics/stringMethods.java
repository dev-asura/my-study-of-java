package module01_basics;

public class stringMethods {
    public static void main(String[] args) {

        String name = "Password";

       // int length = name.length();
       // char letter = name.charAt(0);
       // int index = name.indexOf(" ");
       // int lastIndex = name.lastIndexOf("o");

       // name = name.toUpperCase();
       // name = name.toLowerCase();
       // name = name.trim();
       // name = name.replace("a", "o");

       /*
        if(name.isEmpty()) {
            System.out.println("You don't entered your name.");
        } else {
            System.out.printf("Hello %s.", name);
        }
       */

       /*
        if(name.contains(" ")) {
            System.out.println("You name contains blank spaces.");
        } else {
            System.out.println("Your name doesn't contain blank spaces.");
        }
        */

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password.");
        } else {
            System.out.printf("Hello %s", name);
        }
    }
}
