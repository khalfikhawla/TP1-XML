/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import métier.CalculSommeSérie;


/**
 *
 * @author e-boudhina
 */
public class ControlServletSérie extends HttpServlet {
    
    String nString ;
    Série série ;
    CalculSommeSérie calcul ;
   
    public ControlServletSérie()
    {
        
       série = new Série();
       calcul = new CalculSommeSérie();
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        // response.setContentType("text/html;charset=UTF-8");
        nString  = request.getParameter("n");
        
        série.setN(Integer.parseInt(nString));
        
        série.setS(calcul.CalculeSomme(série.getN()));
        
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/VueSérie.jsp");
        
        request.setAttribute("SH", série.getS());
        
        rd.forward(request, response);
        }catch(Exception e){
           RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/erreur.jsp");
        
        request.setAttribute("exception", e);
        
        rd1.forward(request, response);
        }
       
    }

  
}
