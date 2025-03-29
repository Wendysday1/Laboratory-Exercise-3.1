package librarymanagementsystem;

class Book {
    private static int idCounter = 1;
    private int ID;
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String name) {
        this.ID = idCounter++;
        this.title = title;
        this.author = name;
        this.available = true;
    }

    public int ID() { return ID; }
    public String title() { return title; }
    public String name() { return author; }
    public boolean available() { return available; }
    public void checkOut() { available = false; }
    public void returnBook() { available = true; }
    
    @Override
    public String toString() {
        return "Book ID: " + ID + ", Title: " + title + ", Author: " + author + ", Available: " + available;
}
