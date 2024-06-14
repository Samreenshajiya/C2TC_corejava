package atria.edu.java.oops;

public class Employee {
	
	//data numbers
	private int emp_id;
	private String emp_name;
	private double salary;
	private String designation;
	
	//parameterized constructor
	
	public int getEmp_id() {
		return emp_id;
	}
	public Employee(int emp_id, String emp_name, double salary, String designation) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.designation = designation;
	}
	
	//getters and setters
	
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
		

	

}
