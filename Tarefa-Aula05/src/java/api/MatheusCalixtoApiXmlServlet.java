/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package api;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "MatheusCalixtoApiXmlServlet", urlPatterns = {"api/server/aluno.xml"})
public class MatheusCalixtoApiXmlServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
                processXMLRequest(request, response);
        }
    }
    
    
    protected void processXMLRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            response.setContentType("application/xml;charset=UTF-8");
            response.getWriter().println("<?xml version='1.0' encoding='UTF-8'?>");
            response.getWriter().println("<aluno>");
            response.getWriter().println("<RA>1290482112023</RA>");
            response.getWriter().println("<nome>Matheus Calixto</nome>");
            response.getWriter().println("<materias>");
            response.getWriter().println("<materia>POO</materia>");
            response.getWriter().println("<materia>Metodologia</materia>");
            response.getWriter().println("<materia>Banco de Dados</materia>");
            response.getWriter().println("<materia>SO II</materia>");
            response.getWriter().println("<materia>Engenharia de Software III</materia>");
            response.getWriter().println("<materia>Linguagem de Programação IV</materia>");
            response.getWriter().println("<materia>Inglês IV</materia>");
            response.getWriter().println("</materias>");
            response.getWriter().println("</aluno>");

        }
    }
    
    protected void processJSONRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            response.setContentType("application/json;charset=UTF-8");
            
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
        processRequest(request, response);
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
