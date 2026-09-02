package module01_basics.exercises;

public class textFormatterMethod {
    public static void main(String[] args) {

        System.out.println(formatText("HelLo"));
        System.out.println(formatText("HelLoOoO", false));
        System.out.println(formatText("HelLoOoO", true));
        System.out.println(formatText("world", "hello", "! <3"));
    }
    public static String formatText(String text){
        return text.toUpperCase();
    }

    public static String formatText(String text, boolean toUpper){
        if(toUpper) {
            return text.toUpperCase();
        } else {
            return text.toLowerCase();
        }
    }

    public static String formatText(String text, String prefix, String suffix) {
        return prefix + text + suffix;
    }
}
