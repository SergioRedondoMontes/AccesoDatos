package modelo;

import java.util.ArrayList;

import entidades.Alumnos;
import vista.VistaPrincipal;

public class ModeloPrincipal {
	
	
	private VistaPrincipal vistaPrincipal;
	private Acceso_a_datos modeloDatos;
	
	
	public VistaPrincipal getVistaPrincipal() {
		return vistaPrincipal;
	}
	public void setVistaPrincipal(VistaPrincipal vistaPrincipal) {
		this.vistaPrincipal = vistaPrincipal;
	}
	
	
	public void tipoAcceso(String tipoAcceso) {
	
		
		if(tipoAcceso.equals("Ficheros")){
			modeloDatos = new ModeloFicheros();
			
			
		}else if(tipoAcceso.equals("SQL")){
			modeloDatos = new ModeloSQL();
			
		}
		
	}
	
	
	
	public ArrayList<Alumnos> recogerDatos() {
		
		return modeloDatos.recogerDatos();
		
	}
	
	
	
	
}
