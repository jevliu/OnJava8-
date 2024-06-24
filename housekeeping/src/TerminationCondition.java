/**
 * @author 刘季伟
 * @implNote 展示finalize() 在验证终结条件时的可能作用
 * @since 2024/4/18 21:18:36
 */
//import onjava.*;
class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }
    void checkIn() {
        checkedOut = false;
    }
    @SuppressWarnings("deprecation")
    @Override public void finalize() {
        if(checkedOut)
            System.out.println("Error: checked out");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
//        new onjava.Nap(1); // One second delay
    }
}