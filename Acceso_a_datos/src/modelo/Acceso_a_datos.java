package modelo;

import java.util.ArrayList;

import entidades.Alumnos;

public interface Acceso_a_datos {
	
	
	
	public ArrayList<Alumnos> recogerDatos();
	
	public void insertar();
	
	public void borrar();
	
	public void borrarTodo();
	
	public void actualizar();
	
	
		
	

}
