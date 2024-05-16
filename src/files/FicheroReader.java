package files;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import datos.DataConverter;
import datos.Posicion;

public class FicheroReader {

	
	private static final String NOMBRE_FICHERO = "./barcos.txt"; 
	
	
	public static List<Posicion> getDatos() {

		
		List<Posicion> datos = new ArrayList<Posicion>();
		
		try {
			
			// enlaza con un fichero usando las clases de Java
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(NOMBRE_FICHERO));

			
			// mientras que las lineas existan
			while (ficheroEntrada.ready()) {

				// leo una linea
				String linea = ficheroEntrada.readLine();
				
				// procesar la linea
				// convertir la linea en una Posicion
				try {
					
					// MEJOR VERSION >>>>> datos.add(DataConverter.convert(linea));
					
					int fila = DataConverter.filaConverter(linea.charAt(0));
					int columna = DataConverter.columnaConverter(linea.charAt(1));
				
					// add la Posicion al ArrayList
					Posicion p = new Posicion();
					p.setFila(fila);
					p.setColumna(columna);
					p.setDato(linea);
					datos.add(p);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
			ficheroEntrada.close();
		} catch (IOException e) {

			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otros fallos
			e.printStackTrace();
		}
		
		return datos;
	}	
	
}
