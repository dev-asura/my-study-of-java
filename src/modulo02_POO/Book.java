package modulo02_POO;

public class Book {

    String title;
    String author;
    int pages;



    Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayBookCard() {
        System.out.println(this.title + ", " + this.author + " - " + this.pages + " pages.");
    }
}
