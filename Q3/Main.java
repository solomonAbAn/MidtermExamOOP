package Q3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A.	Create a Faculty object with an ID, name, and a monthly salary of $5000. 
		Faculty myFac = new Faculty(456789, "JAC", 5000);
		//Calculate and display the annual salary of the faculty member.
		myFac.calculateSalary();
		
		//B.	Create a Staff object with an ID, name, an hourly rate of $15, and 160 hours worked.
		Staff myStaff = new Staff(789456,"Team1", 15,160);
		//Calculate and display the monthly salary of the staff member.
		myStaff.calculateSalary();
		
		
	}

}
