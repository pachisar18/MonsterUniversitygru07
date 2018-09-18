/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monsteruniversitygru07;

/**
 *
 * @author Enrique
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.exceptions.jdbc4.MySQLDataException;

public class Conexion {
	private final String servidor="jdbc:mysql://localhost/monsteruniversitygru07";
	private final String usuario="root";
	private final String contrasenia="";
	private Connection conexion=null;

	public Conexion()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conexion=(Connection)DriverManager.getConnection(servidor, usuario, contrasenia);
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("No se encontró la clase para la conexión de base de datos");
		}
		//catch(MySQLDataException ex)
		//{
		//	System.out.println("Error en MySqlDataException");
		//}
		catch(SQLException ex)
		{
			System.out.println("Error en Driver Manager");
		}
		catch(Exception ex)
		{
			System.out.println("Ocurrió un error inesperado en la conexión");
		}
	}
	
	public void cerrarConexion()
	{
		if(conexion!=null)
		{
			try
			{
				conexion.close();
				conexion=null;
			}
			catch(Exception ex)
			{
				System.out.println("No se pudo cerrar la conexión");
			}
		}
	}
	
	public Connection getConexion() {
		return conexion;
	}
}

