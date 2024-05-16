package datos;

public class Posicion {

	private int fila;
	private int columna;
	private String dato;
	
	
	/**
	 * @return the fila
	 */
	public int getFila() {
		return fila;
	}
	/**
	 * @param fila the fila to set
	 */
	public void setFila(int fila) {
		this.fila = fila;
	}
	/**
	 * @return the columna
	 */
	public int getColumna() {
		return columna;
	}
	/**
	 * @param columna the columna to set
	 */
	public void setColumna(int columna) {
		this.columna = columna;
	}
	/**
	 * @return the dato
	 */
	public String getDato() {
		return dato;
	}
	/**
	 * @param dato the dato to set
	 */
	public void setDato(String dato) {
		this.dato = dato;
	}
	@Override
	public String toString() {
		return "[" + fila + "," + columna + "] > " + dato;
	}
	
	
	
	
	
	
}
