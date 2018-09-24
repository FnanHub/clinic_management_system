package controller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.ClinicService;
import model.Doctor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class AdminHomeController extends HttpServlet {

    ObjectMapper mapper = new ObjectMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter out = resp.getWriter();

//        String  act = mapper.readValue(req.getParameter("act"), String.class);

        System.out.println("please work for as ");

        if("services".equals("services")){

            List<ClinicService> clinicService = ClinicService.getClinicServices();

            for (ClinicService d: clinicService){
                System.out.println(d.toString());
            }

            try{
                out.print(mapper.writeValueAsString(clinicService));
            }catch (JsonGenerationException e){
                e.printStackTrace();
            }
        }
        else if("Act".equals("doctors")){

            List<Doctor> doctors = Doctor.doctorList();

            try{
                out.print(mapper.writeValueAsString(doctors));
            }catch (JsonGenerationException e){
                e.printStackTrace();
            }
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is called admin home meley post");
    }
}
