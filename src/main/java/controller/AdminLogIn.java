package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminLogIn extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("uname");
        String password = request.getParameter("psw");
        String []rememberme = request.getParameterValues("");
        if("meley".equals(username) && "123".equals(password)){
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/admin/adminhome.jsp");
            rd.forward(request, response);
            System.out.println("succesfull login");
        }
        System.out.println("this is called admin login post");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("this is called 2 admin login doget");
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/admin/adminlogin.jsp");
        rd.forward(request, response);
    }
}
