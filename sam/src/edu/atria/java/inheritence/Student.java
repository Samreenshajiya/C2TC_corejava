package edu.atria.java.inheritence;

public class Student extends Citizen {
    private int student_id;
    private String name;
    private String department;
    private String proctor;
    
    //constructor using field
    
	public Student(long aadharNo, long voterid, String nationality, int student_id, String name, String department,
			String proctor) {
		super(aadharNo, voterid, nationality);
		this.student_id = student_id;
		this.name = name;
		this.department = department;
		this.proctor = proctor;
	}

	//getters and setters
	
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProctor() {
		return proctor;
	}

	public void setProctor(String proctor) {
		this.proctor = proctor;
	}

	//to string
	
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", department=" + department + ", proctor="
				+ proctor + ", getAadharNo()=" + getAadharNo() + ", getVoterid()=" + getVoterid()
				+ ", getNationality()=" + getNationality() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
    
   
    
    
}
