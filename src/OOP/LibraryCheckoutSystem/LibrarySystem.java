package OOP.LibraryCheckoutSystem;

public class LibrarySystem {
    private LibraryItem[] inventory;

    public LibrarySystem(LibraryItem... items) {
        this.inventory = items;
    }

    public LibraryItem searchByCode(String code) {
        for (LibraryItem item : inventory) {
            if (code.equals(item.getCode())) {
                return item;
            }
        }
        return null;
    }

    public void displayAvailableItems(){
        for(LibraryItem item : inventory) {
            if(item.getBooleanIsBorrowed() == false){
                System.out.println(item);
            }
        }
    }
}
