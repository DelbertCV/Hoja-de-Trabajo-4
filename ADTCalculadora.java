/*
Interface para Calculadora, seccion 10 de 
Algoritmos y estructuras de datos
Hoja de Trabajo 2
*/

import java.io.FileNotFoundException;

public interface ADTCalculadora<P> {
	public void readFile(String file) throws FileNotFoundException, Exception;
	public P calcular() throws Exception;
	
	
}
