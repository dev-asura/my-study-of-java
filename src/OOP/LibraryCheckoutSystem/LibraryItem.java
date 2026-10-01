package OOP.LibraryCheckoutSystem;

public class LibraryItem implements Borrowable{

    private String title;
    private String code;
    private boolean isBorrowed;

    LibraryItem(String title, String code){
        this.title = title;
        this.code = code;
        isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public String getIsBorrowed(){
        if(isBorrowed == true){
            return "Borrowed";
        } else {
            return "Available";
        }
    }

    public boolean getBooleanIsBorrowed(){
        return isBorrowed;
    }

    @Override
    public boolean borrowItem() {
        if(isBorrowed == false){
            return isBorrowed = true;
        } else {
            return false;
        }
    }

    @Override
    public void returnItem(){
        if(isBorrowed == true){
            System.out.println("You returned the book " + title + " to the library.");
            isBorrowed = false;
        } else {
            System.out.println("You can't return this book, cause it still in the library.");
        }
    }
}
