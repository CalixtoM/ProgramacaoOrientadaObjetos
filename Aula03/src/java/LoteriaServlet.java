/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "loteriaServlet", urlPatterns = {"/loteria.html"})
public class loteriaServlet extends HttpServlet {

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
            Random aleatorio = new Random();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loteriaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            int numero = 0;
            int[] numeros = new int[6];
            int[] finalNums = new int[6];
            int indice = -1;
            int cont = 0;
            
            for(int i = 0; i<6; i++){
                numero = aleatorio.nextInt(60) + 1;
                numeros[i] = numero;
            }
            
            out.println("<h1>Numeros antes da verificacao: </h1>");
            for(int i = 0; i<6; i++){
                out.println("<h1>" + numeros[i] + "</h1>");

            }
            out.println("<br><br>");
            
            for(int i = 0; i<6; i++){
                for(int j = 0; j < 6; j++){
                    if(i != j){
                        if(numeros[i] == numeros[j]){
                            indice = j;
                            cont++;
                        }
                    }
                }
            }

            out.println(indice);
            out.println("<br><br>");

            while(cont != 0){
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (i != j) {
                            if (numeros[i] == numeros[j]) {
                                numeros[i] = aleatorio.nextInt(60) + 1;
                            }
                        }
                    }
                }
                cont--;
            }
            
            /*if(indice != -1){
                numeros[indice] = aleatorio.nextInt(60) + 1;
            }*/
            
            // Exibir os numeros
            out.println("<h1>Numeros após verificacao: </h1>");
            for(int i = 0; i<6; i++){
                out.println("<h1>" + numeros[i] + "</h1>");

            }
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
