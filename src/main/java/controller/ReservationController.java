package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReservationController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Reservation started");

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/reservation/reservation_form.jsp");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("reservation is made at Post");

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/reservation/reservation.jsp");
        rd.forward(req, resp);
    }
}
