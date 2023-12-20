package Q1;

public class Library {
    private Book[] books;
    private int numBooks;

    public Library(int maxSize) {
        books = new Book[maxSize];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayInfo() {
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchByIsbn(String isbn) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                System.out.println(books[i]);
                return;
            }
        }
        System.out.println("Book not found with ISBN: " + isbn);
    }

 // Calculate the total value of all books and magazines in the library
    public double calculateTotalValue() {
        double totalValue = 0.0;
        for (int i = 0; i < numBooks; i++) {
            totalValue += books[i].getPrice();
        }
        return totalValue;
    }

    // Remove a book or magazine from the library based on its ISBN
    public void removeByIsbn(String isbn) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                System.out.println("Item removed with ISBN: " + isbn);
                // Shift remaining elements to fill the gap
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[numBooks - 1] = null;  // Set the last element to null
                numBooks--;
                return;
            }
        }
        System.out.println("Item not found with ISBN: " + isbn);
    }
}

	
	
	

