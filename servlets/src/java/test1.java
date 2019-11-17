/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spencer
 */
public class test1 extends HttpServlet {

   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      int num1 = Integer.valueOf(request.getParameter("num1"));
      int num2 = Integer.valueOf(request.getParameter("num2"));
      int ans = num1+num2;
         
      out.println("<!doctype html>" +
         "<html>\n" +
            "<head><title>" + "Answer" + "</title></head>\n" +
            "<h1>The Answer is printed below</h1>\n" +
            "\n" +"<b>Answer</b>: " +  ans +
            "</body>" +
         "</html>"
      );
   }

   
   @Override
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      doGet(request, response);
   }
}

   