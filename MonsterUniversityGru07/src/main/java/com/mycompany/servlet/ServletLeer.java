/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author enrique
 */
@WebServlet(name = "ServletLeer", urlPatterns = {"/ServletLeer"})
public class ServletLeer extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletLeer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletLeerr at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("leer.jsp").forward(request, response);
        
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


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package com.mycompany.servlet;

import com.mycompany.bean.Persona;
import com.mycompany.monsteruniversitygru07.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet(name = "ServletLeer", urlPatterns = {"/ServletLeer"})
public class ServletLeer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletLeer() {
        super();
        // TODO Auto-generated constructor stub
    }


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conexion conexion=new Conexion();
		
		try
		{
			String sql="select * from tpersona";
			
			PreparedStatement prepareStatemente=(PreparedStatement)conexion.getConexion().prepareStatement(sql);
			ResultSet resultSet=prepareStatemente.executeQuery();
			
			List<Persona> listaPersona=new ArrayList<Persona>();
			
			while(resultSet.next())
			{
				Persona persona=new Persona();
				
				persona.setId(resultSet.getInt("id"));
				persona.setNombre(resultSet.getString("nombre"));
				persona.setApellido(resultSet.getString("apellido"));
				persona.setDocumentoIdentidad(resultSet.getString("documentoIdentidad"));
				persona.setCorreoElectronico(resultSet.getString("correoElectronico"));
				persona.setFechaNacimiento(resultSet.getDate("fechaNacimiento"));
				persona.setFechaRegistro(resultSet.getDate("fechaRegistro"));
				persona.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
				
				listaPersona.add(persona);
			}
			
			prepareStatemente.close();
			resultSet.close();
			
			request.setAttribute("listaPersona", listaPersona);
			
			request.getRequestDispatcher("leer.jsp").forward(request, response);
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			conexion.cerrarConexion();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
*/