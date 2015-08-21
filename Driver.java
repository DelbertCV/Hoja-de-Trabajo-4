/**
 * 
 */

/**
 * @author Delbert Custodio -> 14246, Jonathan Aguirre -> 14349, Samuel Diaz -> 14083
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Driver {
	
	public static void main (String args[] ){
		String DireccionArchivo;
		BufferedReader LectorBuffer;
		FileReader FileR;
		Calc Calcu;
		Scanner Scan = new Scanner(System.in);
		double resultado;
		int a = 0;
		int b = 1;	
		
		while (a!=1){
		try {
			System.out.println("----------------------------------------------------------");
			if (b == 1){
			System.out.println("Universidad del Valle de Guatemala \n Algoritmos y Estructuras de Datos\n");
			System.out.println("Seccion 10 \n Delbert Custodio, 14246 \n Jonathan Aguirre, 14349 \n Samuel Diaz, 14083");
			}
			System.out.println();
	
			System.out.println("Por favor, ingrese la direccion de su archivo de texto: \n");
			System.out.println("Tomar en cuenta que puede escribir solo el nombre del archivo seguido de .txt si este se encuentra en la misma carpeta que \n los archivos java.");
	
			DireccionArchivo = Scan.nextLine();
			System.out.println();
	
			Calcu = new Calc();
			
			Calcu.readFile(DireccionArchivo);
			System.out.println();
			System.out.println("La expresion en postfix es :"+Calcu.getLinea());
			
			resultado = Calcu.calcular();
			
			System.out.println("El resultado de la expresion postfix es: "+resultado);
			a = 1;
			
			
		} catch (Exception io){
			System.out.println("Revise su string en postfix, es posible que \nexista una division dentro de 0 o que el \nformato ingresado sea incorrecto. \n Tambien puede revisar la direccion de su archivo.");
			b = 2;
		}
			}
	}

}