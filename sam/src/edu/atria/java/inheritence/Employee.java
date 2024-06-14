package edu.atria.java.inheritence;

public class Employee extends Citizen {
    private int emp_id;
    private String name;
    private String designation;
    private double salary;
    
  //constructor using field
	public Employee(long aadharNo, long voterid, String nationality, int emp_id, String name, String designation,
			double salary) {
		super(aadharNo, voterid, nationality);
		this.emp_id = emp_id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	//getters and setters

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//to string
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", getAadharNo()=" + getAadharNo() + ", getVoterid()=" + getVoterid() + ", getNationality()="
				+ getNationality() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
 
    
}
