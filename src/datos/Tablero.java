package datos;

import java.util.List;

public class Tablero {

	private char[][] panel;
	private final int FILAS = 9;
	private final int COLUMNAS = 10;
	
	
	public Tablero() {
		
		panel = new char[FILAS][COLUMNAS];
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				
				panel[i][j] = ' ';
			}
		}
	}
	
	
	
	public void setTocados(List<Posicion> posiciones) {
		
		for(Posicion p: posiciones) {
			
			try {
				panel[p.getFila()][p.getColumna()] = 'X';
			}
			catch(Exception e) {}
		}
		
	}
	
	
	
	public String toString() {
		
		String salida = "  ";
		
		for (int j = 0; j < COLUMNAS; j++) {
			
			salida += " " + j;
		}
		salida += '\n';
		for (int i = 0; i < FILAS; i++) {
			salida += i + " ";
			for (int j = 0; j < COLUMNAS; j++) {
				
				salida += " " + panel[i][j];
			}
			salida += "\n";
		}
		salida += "  ";
		for (int j = 0; j < COLUMNAS; j++) {
			
			salida += " " + j;
		}
		salida += '\n';
		
		return salida;
	}
	
	
	
	
	
	
}
