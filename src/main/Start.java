package main;

import java.util.List;



import datos.Posicion;
import datos.Tablero;
import files.FicheroReader;

public class Start {

	public static void main(String[] args) {
		
		
		
		List<Posicion> casillas = FicheroReader.getDatos();
		System.out.println(casillas);
		
		Tablero tablero = new Tablero();
		tablero.setTocados(casillas);
		System.out.println(tablero);
		
		

	}

}
