package module01_basics.exercises;

public class textSearchUtility {
    public static void main(String[] args){

        String text = "Hello, my email is thiago.lucas@gmail.com";
        System.out.println(findOccurrence(text, '@'));

        text = "Hello, my email is thiago.lucas@gmail.com. and my instagram @ is thiagols";
        System.out.println(findOccurrence(text, '@', 36));

        System.out.println(findOccurrence(text, "my"));
    }


    public static String findOccurrence(String text, char target){
        int index = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == target){
                index = i;
                break;
            }
        }
        return "Target found at index: " + index;
    }

    public static String findOccurrence(String text, char target, int fromIndex){
        int index = 0;
        for(int i = fromIndex; i < text.length(); i++){
            if(target == text.charAt(i)){
                index = i;
                break;
            }
        }
        return "Target found at index: " + index;
    }

    public static String findOccurrence(String text, String targetWord){
        int index = 0;
        if(text.contains(targetWord)){
            index = text.indexOf(targetWord);
            return "Word found at index: " + index;
        } else {
            return "Word not found!";
        }
    }
}
