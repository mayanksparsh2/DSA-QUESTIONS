package com.example.handson25thq2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/register")
public class RegisterFormServ extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("first_name");
        String lastName = req.getParameter("last_name");
        int age = 0;
        try {
            age = Integer.parseInt(req.getParameter("age"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        String userId = req.getParameter("user_id");
        String pass = req.getParameter("password");
        String outputMsg = "";

        if (firstName.length() < 3) {outputMsg = outputMsg + " First name should be atleast 3 characters\n ";}
        if (lastName.length() < 3) {outputMsg = outputMsg + " Last name should be atleast 3 characters \n";
        if (age < 18) {outputMsg = outputMsg + " UnderAge: should be atleast 18 \n";}
        if (userId.length() < 6) {outputMsg = outputMsg + " userId should be atleast 6 characters \n";}
        if (pass.length() <8) {outputMsg = outputMsg + " Password: should be atleast 8 \n";}

        if (outputMsg.length()>2) {
            resp.getWriter().println(outputMsg + "");
        }
        }else {
            RequestDispatcher dispatcher=req.getRequestDispatcher("Welcome.html");
            dispatcher.forward(req,resp);
        }

    }
}
