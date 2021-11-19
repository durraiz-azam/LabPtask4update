package servlets;

import DB.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "person")
public class person extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String fname = request.getParameter("fname");
String lname = request.getParameter("lname");
String phone = request.getParameter("phone");
String email = request.getParameter("email");
String address1 = request.getParameter("Address1");
String address2 = request.getParameter("Address2");
        DbConnection db = new DbConnection();
        db.insertRecord(fname,lname,phone,email,address1,address2);






    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
