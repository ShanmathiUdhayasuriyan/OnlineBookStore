package projectonline;

public class Fiction extends Book {
	public Fiction(String title, double price, int quantity) {
		super(title, price, quantity);
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Fiction";
	}
}
	

	
