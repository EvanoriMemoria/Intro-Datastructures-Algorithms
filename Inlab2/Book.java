
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
    private String title;
    private int books;
    private double price;
    
    //Book constructor, title,number of books, price
    
    public Book(String title, int books, double price)
    {
        this.title = title;
        this.books = books;
        this.price = price;
    }
    
    //returns the title of the book
    
    public String getTitle()
    {
        return title;
    }
    
    //returns the number of books in stock
    
    public int getBooks()
    {
        return books;
    }
    
    //returns the price of an individual book
    
    public double getPrice()
    {
        return price;
    }
   
    //returns the total price of all books in stock
    
    public double totalPrice()
    {
        return price*books;
    }
    
    //subtracts the number of books sold from the total number of books in stock one at a time
    //The input dictates how many times the for loop runs.
    
    public void bookSold(int copSold)
    {
        for(int i=0;i<copSold;i++)
        {
            books -= 1;
        }
    }
}
