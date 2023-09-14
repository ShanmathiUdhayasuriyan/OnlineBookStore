package projectonline;

public interface BookStore {
	boolean isBookAvailable(String title);
	boolean purchaseBook(String title , int quantity);


}
