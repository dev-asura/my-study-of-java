package OOP.LibraryCheckoutSystem;

public class MagazineItem extends LibraryItem{
    private int issue;

    MagazineItem(String title, String code, int issue){
        super(title, code);
        this.issue = issue;
    }

    public int getIssue(){
        return issue;
    }

    @Override
    public String toString(){
        return "MAGAZINE | Code: " + this.getCode() +
                " | Title: " + this.getTitle() +
                " | Issue #: " + getIssue() +
                " | Status: " + getIsBorrowed();
    }
}

