package Q3;

public abstract Employee {
	 
	
	
	 private int id;// Represents the employee's ID number.
	 private String name ;//Represents the employee's name
	
	
	 //Write 3 different constructor
	public Employee() {
		id = 123456;
		name = "Unnamed";
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(Employee c) {
		id = c.id;
		name = c.name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 //calculateSalary(): This method should be overridden by subclasses to calculate the salary of 
	//different types of employees.
	public void calculateSalary(){
		
	}
	 

	 
}
