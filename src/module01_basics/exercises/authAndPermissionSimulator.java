package module01_basics.exercises;

public class authAndPermissionSimulator {
    public static void main(String[] args){

        String username = "thiago";
        String password = "12345";
        String token = "BEARER_123";
        String pin = "999";

        if(authUser(username, password)){
            System.out.println("YOU LOGGED IN.");
        } else {
            System.out.println("INVALID CREDENTIALS!");
        }

        username = "admin";
        password = "1234";

        if(authUser(username, password)){
            System.out.println("YOU LOGGED IN.");
        } else {
            System.out.println("INVALID CREDENTIALS!");
        }

        //###########################################################

        if(authUser(username, password, pin)){
            System.out.println("YOU LOGGED IN.");
        } else {
            System.out.println("INVALID CREDENTIALS!");
        }

        pin = "9999";

        if(authUser(username, password, pin)){
            System.out.println("YOU LOGGED IN.");
        } else {
            System.out.println("INVALID CREDENTIALS!");
        }

        //###########################################################

        if(authUser(token)){
            System.out.println("YOU LOGGED IN.");
        } else {
            System.out.println("INVALID CREDENTIALS!");
        }

        token = "BEARER_1234";

        if(authUser(token)){
            System.out.println("YOU LOGGED IN.");
        } else {
            System.out.println("INVALID CREDENTIALS!");
        }
    }

    public static boolean authUser(String username, String password){
        return username.equals("admin") && password.equals("1234");
    }

    public static boolean authUser(String username, String password, String pin){
        return username.equals("admin") && password.equals("1234") && pin.equals("9999");
    }

    public static boolean authUser(String token) {
        if(token.startsWith("BEARER_") && token.length() > 10) {
            return true;
        } else {
            return false;
        }
    }
}
