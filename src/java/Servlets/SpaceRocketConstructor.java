/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Rocket.*;
import Booster.*;
import Engine.*;
import Intefaces.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ervin
 */
@WebServlet(name = "SpaceRocketConstructor", urlPatterns = {"/SpaceRocketConstructor"})
public class SpaceRocketConstructor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SpaceRocketConstructor</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SpaceRocketConstructor at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        try ( PrintWriter out = response.getWriter()) {
            String model = request.getParameter("rModel");
            Capsule C = new Capsule(request.getParameter("cModel"),Double.parseDouble(request.getParameter("cWeight")));
            RocketEngine_Booster ReB = new RocketEngine_Booster(Double.parseDouble(request.getParameter("beWeight")));
            RocketEngine_Main ReM = new RocketEngine_Main(Double.parseDouble(request.getParameter("meWeight")));
            Booster_Center BC = new Booster_Center(Double.parseDouble(request.getParameter("cbWeight")),ReM);
            Booster_Port BP = new Booster_Port(Double.parseDouble(request.getParameter("pbWeight")),ReB);
            Booster_Starboard BS = new Booster_Starboard(Double.parseDouble(request.getParameter("sbWeight")),ReB);
            Booster[] Boosters = {BC, BP, BS};
            SpaceRocket SR = new SpaceRocket(model, C, Boosters);
            Launchable.silos.add(SR);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>SpaceRocketConstructor</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1> Space Rocket Constructed</h1>");
            for(int i=0; i<= Launchable.silos.size()-1; i++){
                out.println("<p><h2>Space Rocket</h2></p><br>");
                String rInfo = Launchable.silos.get(i).toString();
                out.println(rInfo);  
            }
            out.println("<br><br><form action=\"index.html\">");
            out.println("<input type=\"submit\" value=\"Build Another Space Rocket\">");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
            
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
