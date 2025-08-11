package myJobPortal.DAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import myJobPortal.DTO.Applicant;
import myJobPortal.DTO.Application;
import myJobPortal.DTO.Job;
import myJobPortal.DTO.Recruiter;

public class myDao {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc"); 
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();
	
	public static void recruiterSignup(Recruiter recruiter) {
		et.begin();
		em.persist(recruiter);
		et.commit();
	}
	
	public static Recruiter recruiterLogin(String organizationName, String organizationPassword) {
		Query query = em.createQuery("select re from Recruiter re where re.organizationName = ?1");
		query.setParameter(1, organizationName);
		Recruiter dbRecruiter = (Recruiter) query.getSingleResult();
		if(dbRecruiter != null && dbRecruiter.getOrganizationPassword().equals(organizationPassword)) {
			return dbRecruiter;
		}
		return null;
	}
	
	public static void createJob(int recruiterId, Job job) {
		Recruiter recruiter = em.find(Recruiter.class, recruiterId);
		if(recruiter.getJob() == null) {
			List<Job> jobs =  new ArrayList<Job>();
			jobs.add(job);
		}
		else {
			recruiter.getJob().add(job);
		}
		
		et.begin();
		em.merge(recruiter);
		et.commit();
	}
	
	public static List<Job> findJobsByRecruiterId(int recruiterId){
		List<Job> jobs = em.find(Recruiter.class, recruiterId).getJob();
		return jobs;
	}
	
	public static Job findJobByJobId(int jobId) {
		return em.find(Job.class, jobId);
	}
	
	public static void updateJob(Job job) {
		et.begin();
		em.merge(job);
		et.commit();
	}
	
	public static void ApplicantsSignup(Applicant applicant) {
		et.begin();
		em.persist(applicant);
		et.commit();
	}

	public static Applicant applicantLogin(String email, String password) {
		Query query = em.createQuery("select ap from applicant ap where ap.email = ?1");
		query.setParameter(1, email);
		Applicant applicant = (Applicant) query.getSingleResult();
		if(applicant != null && applicant.getPassword().equals(password)) {
			return applicant;
		}
		return null;
	}
	
	public static void applicantJobApply(int applicantId, int jobId) {
		Applicant applicant = em.find(Applicant.class, applicantId);
		Job job = em.find(Job.class, jobId);
		
//		if(applicant != null && job !=null) {
//			Query query = em.createQuery("select ap from applicant ap where ap.applicantId = ? and ap.jobId = ?");
//			query.setParameter(1, applicantId);
//			query.setParameter(2, jobId);
//			Application checkApplications = (Application) query.getSingleResult();
//			
//			if(checkApplications == null) {
//				LocalDate date = LocalDate.now();
//				String stringDate  = String.valueOf(date);
//				
//				Application application = new Application(applicantId, jobId, "pending",stringDate, job.getDesignation(), 
//						job.getSalary(), job.getExperience(), job.getLocation(), job.getSkill());
//				
//				applicant.getApplication().add(application);
//				job.getApplication().add(application);
//				
//				et.begin();
//				em.merge(applicant);
//				em.merge(job);
//				et.commit();
//			}			
//		}
		
		if(applicant != null && job != null) {
			LocalDate date = LocalDate.now();
			String stringDate  = String.valueOf(date);
			
			Application application = new Application(applicantId, "pending", stringDate, job.getDesignation(), 
					job.getSalary(), job.getExperience(), job.getLocation(), job.getSkill());
			
			applicant.getApplication().add(application);
			job.getApplication().add(application);
			
			et.begin();
			em.merge(applicant);
			em.merge(job);
			et.commit();
		}
	}
	
	public static List<Application> viewApplicantionsByApplicantId(int applicantId){
		return em.find(Applicant.class, applicantId).getApplication();
	}
	
	public static List<Application> viewApplicationsByJobId(int jobId){
		return em.find(Job.class, jobId).getApplication();
	}
	
}
