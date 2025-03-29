package librarymanagementsystem;
import java.util.Scanner;

public class Librarybackend {
    public static void main(String[] args) {
        Library bubblearray = new Library();
        Scanner look = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nLibrary System:");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display Books");
            System.out.println("5. Check Out Book");
            System.out.println("6. Return Book");
            System.out.println("7. Sort Books by Title");
            System.out.println("8. Exit");
            System.out.print("Select: ");
            
            int select = look.nextInt();
            look.nextLine();  
            
            switch (select) {
                case 1:
                    System.out.print("Please enter the book title: ");
                    String book = look.nextLine();
                    
                    System.out.print("Please enter the name of author: ");
                    String name = look.nextLine();
                    
                    bubblearray.add(book, name);
                    break;
                    
                case 2:
                    System.out.print("Please enter the book title or author: ");
                    String keyword = look.nextLine();
                    bubblearray.search(keyword);
                    break;
                case 3:
                    System.out.print("Please enter book the title to delete: ");
                    String delete = look.nextLine();
                    bubblearray.delete(delete);
                    break;
                    
                case 4:
                	bubblearray.display();
                    break;
                case 5:
                    System.out.print("Please enter the book title to check out: ");
                    String checkout = look.nextLine();
                    bubblearray.checkout(checkout);
                    break;
                    
                case 6:
                    System.out.print("Please enter the book title to return: ");
                    String returnbook = look.nextLine();
                    bubblearray.returning(returnbook);
                    break;
                case 7:
                	bubblearray.sort();
                    break;
                    
                case 8:
                    System.out.println("Bye!");
                    look.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}