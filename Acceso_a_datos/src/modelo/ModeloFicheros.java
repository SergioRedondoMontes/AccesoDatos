package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import entidades.Alumnos;

public class ModeloFicheros implements Acceso_a_datos {

	@Override
	public ArrayList<Alumnos> recogerDatos() {

		ArrayList<Alumnos> list = new ArrayList<Alumnos>();

		File file = new File("bbdd/datos.txt");
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(file));
			String text = null;
			Alumnos alumno = null;

			while ((text = reader.readLine()) != null) {
				System.out.println(text);

				String[] datosaux = text.split(",");

				alumno = new Alumnos(Integer.parseInt(datosaux[0]), datosaux[1], datosaux[2], datosaux[3],
						Integer.parseInt(datosaux[4]), datosaux[5]);
				list.add(alumno);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(list);
		return list;

	}

	@Override
	public void insertar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrarTodo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub

	}

}
