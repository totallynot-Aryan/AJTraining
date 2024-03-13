import java.util.ArrayList;

public class Book {
    int bookID;
    String bookName;
    String authorName;

    Book(int bookID, String bookName, String authorName) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public int getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    //optional
    //public String toString(){
    //    return "Books ["+"Book ID: " + getBookID()+", Book Name: " + getBookName()+", Author Name: " + getAuthorName()+"]";
    //}

    public static void main(String[] args) {
        ArrayList<Book> al = new ArrayList<Book>();
        al.add(new Book(101, "Life of Atul", "Maine"));
        al.add(new Book(102, "Life of Sumit", "Kisi Or Ne"));
        al.add(new Book(103, "Life of Kuldeep", "Kisi ne bhi ni"));

        // Accessing elements using enhanced for loop
        System.out.println("All Books:");
        for (Book bk : al) {
            //System.out.println(bk.toString());
            System.out.println("Books ["+"Book ID: " + bk.getBookID()+", Book Name: " + bk.getBookName()+", Author Name: " + bk.getAuthorName()+"]");
        }
    }
}
