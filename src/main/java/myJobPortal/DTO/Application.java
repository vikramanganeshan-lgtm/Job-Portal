package myJobPortal.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int userId;
//	private int jobId;
	private String status;
	private String date;
	private String designation;
	private double salary;
	private String experience;
	private String location;
	private String skill;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
//	public int getJobId() {
//		return jobId;
//	}
//
//	public void setJobId(int jobId) {
//		this.jobId = jobId;
//	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
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
	
	public String getExperience() {
		return experience;
	}
	
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getSkill() {
		return skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public Application() {
		super();
	}

	public Application(int userId, String status, String date, String designation, double salary,
			String experience, String location, String skill) {
		super();
		this.userId = userId;
//		this.jobId = jobId;
		this.status = status;
		this.date = date;
		this.designation = designation;
		this.salary = salary;
		this.experience = experience;
		this.location = location;
		this.skill = skill;
	}
	
}
