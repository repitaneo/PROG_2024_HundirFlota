package datos;

import fallos.RangoInvalidoException;

public class DataConverter {

	public static int filaConverter(char letra) throws RangoInvalidoException {

		int ascci = letra;
		
		if(ascci<65 || ascci>74) 
				throw new RangoInvalidoException("fila leida fuera de rango ["+letra+"]");
		
		return ascci-65;
	}
	
	

	public static int columnaConverter(char charAt) throws RangoInvalidoException {
			
		int columna = Integer.parseInt(""+charAt);
		
		if(columna<1 || columna>9)
			throw new RangoInvalidoException("columna leida fuera de rango ["+charAt+"]");
		
		return columna-1;
		
	}

}
