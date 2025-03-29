package librarymanagementsystem;
import java.util.ArrayList;

class Library {
    private ArrayList<Book> bubblearray;

    public Library() {
        this.bubblearray = new ArrayList<>();
    }

    public void add(String title, String author) {
    	bubblearray.add(new Book(title, author));
        System.out.println("Book added successfully.");
    }

    public void search(String keyword) {
        for (Book booksearch : bubblearray) {
            if (booksearch.title().equalsIgnoreCase(keyword) || booksearch.name().equalsIgnoreCase(keyword)) {
                System.out.println(booksearch);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void delete(String title) {
    	bubblearray.removeIf(book -> book.title().equalsIgnoreCase(title));
        System.out.println("Book is deleted successfully.");
    }

    public void display() {
        if (bubblearray.isEmpty()) {
            System.out.println("Not available.");
            return;
        }
        for (Book delete : bubblearray) {
            System.out.println(delete);
        }
    }

    public void checkout(String title) {
        for (Book booktitle : bubblearray) {
            if (booktitle.title().equalsIgnoreCase(title) && booktitle.available()) {
                booktitle.checkOut();
                System.out.println("Book checked out successfully.");
                return;
            }
        }
        System.out.println("The book is not available or not found.");
    }

    public void returning(String title) {
        for (Book returnbook : bubblearray) {
            if (returnbook.title().equalsIgnoreCase(title) && !returnbook.available()) {
                returnbook.returnBook();
                System.out.println("The book is returned successfully.");
                return;
            }
        }
        System.out.println("The book is not found or already available.");
    }

    public void sort() {
        int n = bubblearray.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bubblearray.get(j).title().compareToIgnoreCase(bubblearray.get(j + 1).title()) > 0) {
                    Book sort = bubblearray.get(j);
                    bubblearray.set(j, bubblearray.get(j + 1));
                    bubblearray.set(j + 1, sort);
                }
            }
        }
        System.out.println("Books are now sorted.");
    }
}