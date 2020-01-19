package Ejemplo_Apuntes;
import java.util.Scanner;

public class Dobles {
	final static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[]args) {
		//Ejemplo que calcula y muestra el doble de 'e' números empezando en 0
		
		
			int e=0;
			
					System.out.println("Introduce el número de elementos de la matriz: ");
					e = TECLADO.nextInt();
					
			int [] doble= new int [e];
			
			for (int i=0; i<e; i++) {
				doble[i]=i*2;	
			}
	
			for (int i=0; i<e; i++){
					System.out.println("El doble de " + i + " es = " +doble[i]);
			}
	}
}
