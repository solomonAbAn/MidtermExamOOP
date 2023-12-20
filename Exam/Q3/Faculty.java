package Q3;

public class Faculty extends Employee {
	private double monthlySalary;// Represents the monthly salary of the faculty member.

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
		monthlySalary = 2000;

	}

	public Faculty(int id, String name, double monthlySalary) {
		super(id, name);
		// TODO Auto-generated constructor stub
		this.monthlySalary = monthlySalary;
	}

	public Faculty(Faculty c) {
		super(c);
		// TODO Auto-generated constructor stub
		monthlySalary = c.monthlySalary;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	//calculateSalary(): Overrides the  calculateSalary() 
			//method to calculate the annual salary of the faculty member, 
			//which is the monthly salary multiplied by 12.
	public void calculateSalary(){
		System.out.println("The Annual Salaray of " + super.getName() + " is " + getMonthlySalary() + "$.");
		
	}
	
	
	

}
