package OOP.LibraryCheckoutSystem;

public class BookItem extends LibraryItem{
    private String author;

    BookItem(String title, String code, String author){
        super(title, code);
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public String toString(){
        return "BOOK | Code: " + this.getCode() +
                " | Title: " + this.getTitle() +
                " | Author: " + getAuthor() +
                " | Status: " + getIsBorrowed();
    }
}
