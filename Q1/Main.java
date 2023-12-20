package Q1;


public class Main {
//Systene To Manage A Library
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Book[] libraryContents = new Book[5];

	        // Using setters to initialize these objects
	        libraryContents[0] = new Book();
	        libraryContents[0].setTitle("Default Book");
	        libraryContents[0].setAuthor("Default Author");
	        libraryContents[0].setIsbn("0000000000");
	        libraryContents[0].setPrice(9.99);

	        libraryContents[1] = new Book();
	        libraryContents[1].setTitle("The Great Gatsby");
	        libraryContents[1].setAuthor("F. Scott Fitzgerald");
	        libraryContents[1].setIsbn("978-0743273565");
	        libraryContents[1].setPrice(15.99);

	        libraryContents[2] = new Magazine();
	        libraryContents[2].setTitle("Default Magazine");
	        libraryContents[2].setAuthor("Default Magazine Author");
	        libraryContents[2].setIsbn("1111111111");
	        libraryContents[2].setPrice(5.99);
	        ((Magazine) libraryContents[2]).setIssueNumber(123);

	        libraryContents[3] = new Magazine();
	        libraryContents[3].setTitle("National Geographic");
	        libraryContents[3].setAuthor("National Geographic Society");
	        libraryContents[3].setIsbn("NG789");
	        libraryContents[3].setPrice(6.99);
	        ((Magazine) libraryContents[3]).setIssueNumber(789);

	        // Display information about all books and magazines in the array
	        System.out.println("Library Contents:");
	        for (Book item : libraryContents) {
	            if (item != null) {
	                System.out.println(item);
	            }
	        }

	        // Demonstrate the use of various constructors, method overriding, and overloading
	        Book copyBook = new Book(libraryContents[1]);  // Using copy constructor
	        Magazine copyMagazine = new Magazine((Magazine) libraryContents[3]);  // Using copy constructor

	        // Create a library with a maximum capacity of 10 books
	        Library library = new Library(10);

	        // Add books and magazines to the library
	        for (Book item : libraryContents) {
	            if (item != null) {
	                library.addBook(item);
	            }
	        }

	        // Calculate the total value of all books and magazines in the library
	        double totalValue = library.calculateTotalValue();
	        System.out.println("\nTotal value of all books and magazines in the library: $" + totalValue);

	        // Remove a book or magazine from the library based on its ISBN
	        library.removeByIsbn("NG789");

	        // Display updated information about all books in the library
	        System.out.println("\nUpdated Library Contents:");
	        library.displayInfo();
	    }
}
