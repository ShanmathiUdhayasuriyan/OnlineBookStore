package projectonline;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        OnlineBook bookstore = new OnlineBook();

        while (true) {
            System.out.println("Welcome to the Online Bookstore!");
            System.out.println("1. Check Book Availability");
            System.out.println("2. Purchase a Book");
            System.out.println("3. Display Available Books");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
            case 1:
            	
                System.out.print("Enter the title of the book: ");
                String bookTitle = scanner.nextLine();
                boolean available = bookstore.isBookAvailable(bookTitle);
                System.out.println(available ? "The book is available." : "The book is not available.");
                break;
            case 2:
                System.out.print("Enter the title of the book you want to purchase: ");
                String purchaseTitle = scanner.nextLine();
                System.out.print("Enter the quantity you want to purchase: ");
                int purchaseQuantity = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                bookstore.purchaseBook(purchaseTitle, purchaseQuantity);
                break;
            case 3:
                bookstore.displayAvailableBooks();
                break;
            case 4:
                System.out.println("Thank you for visiting the Online Bookstore!");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
                
            

	}

}
