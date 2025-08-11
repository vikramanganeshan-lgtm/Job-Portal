package myJobPortal.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import myJobPortal.DAO.myDao;
import myJobPortal.DTO.Job;
import myJobPortal.DTO.Recruiter;

@WebServlet("/createJob")
public class createJob extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String designation = req.getParameter("designation");
		double salary = Double.parseDouble(req.getParameter("salary"));
		String experience = req.getParameter("experience");
		String location = req.getParameter("location");
		String skill = req.getParameter("skill");
		
		HttpSession sess = req.getSession();
		Recruiter recruiter = (Recruiter) sess.getAttribute("sessionData");
		Job job = new Job(designation, salary, experience, location, skill, null);
		myDao.createJob(recruiter.getId(), job);
		
		req.setAttribute("recruiterJobs", recruiter.getJob());
		req.getRequestDispatcher("recruiterHome.jsp").forward(req, resp);
	}
	
}
