package edu.atria.java.inheritence;

public class Citizen {
    private long aadharNo;
    private long voterid;
    private String nationality;
    
    //constructor using fields
    
	public Citizen(long aadharNo, long voterid, String nationality) {
		super();
		this.aadharNo = aadharNo;
		this.voterid = voterid;
		this.nationality = nationality;
	}

	//getters and setters
	
	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public long getVoterid() {
		return voterid;
	}

	public void setVoterid(long voterid) {
		this.voterid = voterid;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
      //toString
	
	@Override
	public String toString() {
		return "Citizen [aadharNo=" + aadharNo + ", voterid=" + voterid + ", nationality=" + nationality + "]";
	}
	
}
