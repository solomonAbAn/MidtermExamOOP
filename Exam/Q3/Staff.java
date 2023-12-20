package Q3;

public class Staff extends Employee {
	private double hourlyRate;// Represents the hourly rate of the staff member.
	private int hoursWorked;// Represents the number of hours worked by the staff member.
	
	
	public Staff() {
		hourlyRate = 15;
		hoursWorked = 4;
	}
	
	public Staff(int id, String name, double hourlyRate, int hoursWorked) {
		super(id, name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	public Staff(Staff c) {
		super(c);
		hourlyRate = c.hourlyRate;
		hoursWorked = c.hoursWorked;
	}

	
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	//calculateSalary(): Overrides the calculateSalary() 
	//method to calculate the monthly salary of the staff member, 
	//which is the product of the hourly rate and the number of hours worked.
	public void calculateSalary() {
		System.out.println("The Annual Salaray of " + super.getName() + " is " + getHourlyRate()*getHoursWorked() + "$.");
		
	}
	
	
}
