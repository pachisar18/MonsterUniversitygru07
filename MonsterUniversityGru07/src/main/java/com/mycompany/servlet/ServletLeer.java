/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @authores Enrique,Ximena,Patricia,Elizabeth
 */
@WebServlet(name = "ServletLeer", urlPatterns = {"/ServletLeer"})
public class ServletLeer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLeer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}