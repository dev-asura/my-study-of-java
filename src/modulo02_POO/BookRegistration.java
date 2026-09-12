package modulo02_POO;

public class BookRegistration {
    public static void main(String[] args){

    Book book01 = new Book("The Secret Garden", "Frances H. Burnett", 256);
    Book book02 = new Book("Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien", 322);

    book01.displayBookCard();
    book02.displayBookCard();
    }
}
