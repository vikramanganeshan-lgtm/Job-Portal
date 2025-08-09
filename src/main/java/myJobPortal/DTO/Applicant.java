package myJobPortal.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	private long contact;
	private String email;
	private String primarySkill;
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Application> application;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Application> getApplication() {
		return application;
	}

	public void setApplication(List<Application> application) {
		this.application = application;
	}

	public Applicant() {
		super();
	}

	public Applicant(String name, String city, long contact, String email, String primarySkill, String password,
			List<Application> application) {
		super();
		this.name = name;
		this.city = city;
		this.contact = contact;
		this.email = email;
		this.primarySkill = primarySkill;
		this.password = password;
		this.application = application;
	}

//	@Override
//	public String toString() {
//		return "Applicant [id=" + id + ", name=" + name + ", city=" + city + ", contact=" + contact + ", email=" + email
//				+ ", primarySkill=" + primarySkill + ", password=" + password + ", application=" + application + "]";
//	}
	
}
