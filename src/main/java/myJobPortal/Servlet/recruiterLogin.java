package myJobPortal.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import myJobPortal.DAO.myDao;
import myJobPortal.DTO.Recruiter;

@WebServlet("/recruiterLogin")
public class recruiterLogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String orgName = req.getParameter("orgName");
		String orgPass = req.getParameter("orgPass");
		
		Recruiter recruiter = myDao.recruiterLogin(orgName, orgPass);
		
		if(recruiter != null) {
			HttpSession sess = req.getSession();
			sess.setAttribute("sessionData", recruiter);
			req.setAttribute("recruiterJobs", recruiter.getJob());
			req.getRequestDispatcher("recruiterHome.jsp").forward(req, resp);
		}
		else {
			req.setAttribute("message", "Invalid credentials");
			req.getRequestDispatcher("recruiterLogin.jsp").forward(req, resp);
		}
	}
	
}
