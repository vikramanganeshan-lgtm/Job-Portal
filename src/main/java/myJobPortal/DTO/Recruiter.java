package myJobPortal.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Recruiter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String organizationName;
	private String organizationPassword;
	private String organizationAbout;
	private String organizationWebsite;
	private long organizationEmployeeCount;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Job> job;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOrganizationPassword() {
		return organizationPassword;
	}

	public void setOrganizationPassword(String organizationPassword) {
		this.organizationPassword = organizationPassword;
	}

	public String getOrganizationAbout() {
		return organizationAbout;
	}

	public void setOrganizationAbout(String organizationAbout) {
		this.organizationAbout = organizationAbout;
	}

	public String getOrganizationWebsite() {
		return organizationWebsite;
	}

	public void setOrganizationWebsite(String organizationWebsite) {
		this.organizationWebsite = organizationWebsite;
	}

	public long getOrganizationEmployeeCount() {
		return organizationEmployeeCount;
	}

	public void setOrganizationEmployeeCount(long organizationEmployeeCount) {
		this.organizationEmployeeCount = organizationEmployeeCount;
	}

	public List<Job> getJob() {
		return job;
	}

	public void setJob(List<Job> job) {
		this.job = job;
	}

	public Recruiter() {
		super();
	}

	public Recruiter(String organizationName, String organizationPassword, String organizationAbout, String organizationWebsite,
			long organizationEmployeeCount, List<Job> job) {
		super();
		this.organizationName = organizationName;
		this.organizationPassword = organizationPassword;
		this.organizationAbout = organizationAbout;
		this.organizationWebsite = organizationWebsite;
		this.organizationEmployeeCount = organizationEmployeeCount;
		this.job = job;
	}

//	@Override
//	public String toString() {
//		return "Recruiter [id=" + id + ", organizationName=" + organizationName + ", organizationAbout="
//				+ organizationAbout + ", organizationWebsite=" + organizationWebsite + ", organizationEmployeeCount="
//				+ organizationEmployeeCount + ", job=" + job + "]";
//	}
	
}
