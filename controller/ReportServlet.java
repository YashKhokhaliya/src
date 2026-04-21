package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import dao.ReportDAO;
import model.Report;
import model.User;

public class ReportServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get logged-in user from session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        // If user not logged in
        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        // Get form data
        String type = request.getParameter("type");
        String location = request.getParameter("location");
        String description = request.getParameter("description");

        // Create Report object
        Report r = new Report();
        r.setUserId(user.getId());
        r.setType(type);
        r.setLocation(location);
        r.setDescription(description);

        // Save report to database
        int status = ReportDAO.addReport(r);

        // Redirect based on result
        if (status > 0) {
            response.sendRedirect("dashboard.jsp?msg=success");
        } else {
            response.sendRedirect("report.jsp?msg=error");
        }
    }
}