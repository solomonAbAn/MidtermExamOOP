package Q1;

public class Book {
//Provide comments in your code to explain the purpose of each method and constructor.
	
	
private String title;//	- `title` (String)
private String author;//    - `author` (String)
private String isbn;//    - `isbn` (String)
private double price;//    - `price` (double)

	
//    - Default constructor
public Book() {
	title = "Untitled";
	author = "Unnamed";
	isbn = "045610654056421";
	price = 4.99;
}

//- Demonstrate the use of `super` constructor and `this` constructor.
//    - Parameterized constructor to initialize all attributes
public Book(String title, String author, String isbn, double price) {
	this.title = title;
	this.author = author;
	this.isbn = isbn;
	this.price = price;
}


//    - Copy constructor to create a deep copy of a given Book object
public Book(Book c) {
	title = c.title;
	author = c.author;
	isbn = c.isbn;
	price = c.price;
}



//- Implement getter and setter methods for each attribute.

public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


public String getIsbn() {
	return isbn;
}


public void setIsbn(String isbn) {
	this.isbn = isbn;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", price=" + price + "]";
}





	
}
