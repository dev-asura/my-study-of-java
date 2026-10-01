package OOP.LibraryCheckoutSystem;

public class Main {
    public static void main(String[] args){

        LibraryItem book1 = new BookItem("The Fellowship of the Ring", "1414", "J.R.R. Tolkien");
        LibraryItem book2 = new BookItem("The Two Towers", "1415", "J.R.R. Tolkien");
        LibraryItem magazine1 = new MagazineItem("The Economist", "2009", 193);

        LibraryItem[] items = {book1, book2, magazine1};

        LibrarySystem system = new LibrarySystem(items);
        system.displayAvailableItems();
        System.out.println();

        book1.borrowItem();
        system.displayAvailableItems();
        System.out.println();

        book1.returnItem();
        System.out.println();

        system.displayAvailableItems();
        System.out.println();

        book2.borrowItem();
        System.out.println();

        System.out.println(system.searchByCode("1414"));
        System.out.println(system.searchByCode("1314"));

        System.out.println();
        system.displayAvailableItems();
    }
}
