package projectonline;

public class NonFiction extends Book {
	

	public NonFiction(String title, double price, int quantity) {
		super(title, price, quantity);
		
	}

	@Override
	public String getType() {
		
		return "Non-Fiction";
	}
	

}
