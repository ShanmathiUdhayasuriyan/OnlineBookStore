package projectonline;

import java.util.ArrayList;
import java.util.List;

public class OnlineBook implements BookStore {
	private List<Book> book;
	public OnlineBook()
	{
		book = new ArrayList<>();
		book.add(new Fiction("The White Tiger", 1000, 5));
        book.add(new NonFiction("Wings of Fire", 700, 3));
	}
	
	

	@Override
	public boolean isBookAvailable(String title) {
		// TODO Auto-generated method stub
		for (Book books : book) {
            if (books.getTitle().equalsIgnoreCase(title)) {
                return books.getQuantity() > 0;
            }
        }
        return false;
	
	}

	@Override
	public boolean purchaseBook(String title, int quantity) {
		// TODO Auto-generated method stub
		for (Book books : book) {
            if (books.getTitle().equalsIgnoreCase(title) && books.getQuantity() >= quantity) {
                books.quantity -= quantity;
                System.out.println("Purchase successful!");
                return true;
            }
        }
        System.out.println("Book not available or insufficient quantity.");
		return false;
	}
	public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book books : book) {
            System.out.println(books.getTitle() + " (" + books.getType() + ") - Price: " + books.getPrice() + " - Quantity: " + books.getQuantity());
        }
    }
}
	


