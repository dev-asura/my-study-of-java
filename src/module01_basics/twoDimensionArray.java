package module01_basics;

public class twoDimensionArray {
    public static void main(String[] args){

        // 2D array = An array where each element is an array.
        //            Useful for storing a matrix of data.
        /*
        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};

        groceries[0][0] = "pineapple";
        groceries[1][0] = "broccoli";
        groceries[2][0] = "mutton";

        for(String[] foods : groceries){
            for(String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
        */

        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] characters : telephone) {
            for(char character : characters){
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}
