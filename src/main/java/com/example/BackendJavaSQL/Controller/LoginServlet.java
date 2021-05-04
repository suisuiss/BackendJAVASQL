package com.example.BackendJavaSQL.Controller;

import com.example.BackendJavaSQL.Model.LoginOperation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()){
            response.setContentType("text/html;charset=UTF-8");
            LoginOperation loginOperation = new LoginOperation();
            HttpSession session;
            int userid = loginOperation.checkLogin(request.getParameter("username"),request.getParameter("password"));
            if(userid==0){

            }
            else{
                session= request.getSession();
                session.setAttribute("userid",userid);
            }
        }
    }
}
