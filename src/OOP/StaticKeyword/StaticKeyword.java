package OOP.StaticKeyword;

public class StaticKeyword {
    public static void main(String[] args) {

        // static = Makes a variable of method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Sandy");
        Friend friend4 = new Friend("Squidward");
        Friend friend5 = new Friend("Gary");

        Friend.showFriends();
    }
}