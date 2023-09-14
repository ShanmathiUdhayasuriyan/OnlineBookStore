package projectonline;



//Define an abstract class for a Book
abstract class Book {
 protected String title;
 protected double price;
 protected int quantity;
 
	 public Book(String title, double price, int quantity) {
		 this.title = title;
	     this.price = price;
	     this.quantity = quantity;
 }
	 public abstract String getType(); 
	
public String getTitle() {
	return title;
}


public double getPrice() {
	return price;
}


public int getQuantity() {
	return quantity;
}

}
