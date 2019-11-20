
/**
 * Write a description of class Driver here.
 * 
 * @author Nic Rust 
 * @version September 9, 2016
 */
public class Driver
{
    public static void main(String[] args)
    {
        // initializes two book objects
        Book book1 = new Book("Dracula",22,7.55);
        Book book2 = new Book("The Name of the Wind",50,2.75);
        
        //prints the books in the format desired
        System.out.println("Title: " + book1.getTitle() + ", Price: $" + book1.getPrice());
        System.out.println("Title: " + book2.getTitle() + ", Price: $" + book2.getPrice());
        //gets the total price of book1
        System.out.println("$" + book1.totalPrice());
        
        //prints out the number of books in stock
        System.out.println(book1.getBooks());
        //sells ten books
        book1.bookSold(10);
        //prints out the new number of books in stock
        System.out.println(book1.getBooks());
    }
}
