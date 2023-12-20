package Q1;

public class Magazine extends Book{//	   - Create a class named `Magazine` that extends the `Book` class.
	//Provide comments in your code to explain the purpose of each method and constructor.
	

private int issueNumber;//	   - Add an additional attribute specific to magazines, such as `issueNumber` (int).


//	   - Implement necessary constructors and methods.
//- Demonstrate the use of `super` constructor and `this` constructor.
//- Default constructor
public Magazine() {
super();
issueNumber = 123456;
}


//- Parameterized constructor to initialize all attributes
public Magazine(int issueNumber) {
super();
this.issueNumber = issueNumber;
}


//- Copy constructor to create a deep copy of a given Book object
public Magazine(Magazine c) {
	super(c);
	issueNumber = c.issueNumber;
}





//- Implement getter and setter methods for each attribute.
public int getIssueNumber() {
	return issueNumber;
}


public void setIssueNumber(int issueNumber) {
	this.issueNumber = issueNumber;
}


@Override
public String toString() {
	return "Magazine [title=" + super.getTitle() + ", author=" + super.getAuthor() + ", isbn=" + super.getIsbn() + ", price=" + super.getPrice() + "], issueNumber=" + issueNumber;
}

	
	
}
