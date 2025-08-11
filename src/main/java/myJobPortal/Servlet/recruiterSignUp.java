package myJobPortal.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myJobPortal.DAO.myDao;
import myJobPortal.DTO.Recruiter;

@WebServlet("/recruiterSignUp")
public class recruiterSignUp extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Form Data
		String orgName = req.getParameter("orgName");
		String orgPass = req.getParameter("orgPass");
		String orgAbout = req.getParameter("orgAbout");
		String orgWebsite = req.getParameter("orgWebsite");
		int orgEmpCount = Integer.parseInt(req.getParameter("orgEmpCount"));
		
		if(orgName != null && orgPass != null && orgAbout != null && orgWebsite != null && orgEmpCount != 0) {
			Recruiter recruiter = new Recruiter(orgName, orgPass, orgAbout, orgWebsite, orgEmpCount, null);
			myDao.recruiterSignup(recruiter);
			resp.sendRedirect("recruiterLogin.jsp");
		}
		else {
			req.setAttribute("message", "Invalid credentials");
			req.getRequestDispatcher("recruiterSignUp.jsp").forward(req, resp);
		}
		
	}
	
}
