package Ejemplo_Apuntes;
import java.util.Scanner;

public class EjemploSwitch {

		static Scanner leer=new Scanner(System.in);
		
		public static void main(String[]args) {
			
			int opcion=0;
			System.out.println("Introduzca su opción: ");
			opcion = leer.nextInt();
			

		switch (opcion) {
		
		case 1: 
				System.out.println("Acciones según opción 1");
				break;
		
		case 2:
				System.out.println("Acciones según opción 2");
				break;
				
		case 3:
				System.out.println("Acciones según opción 3");
				break;
				
		case 4:
				System.out.println("Acciones según opción 4");
				break;
				
			default:
				System.out.println("aquí habrá que meter las acciones si se elige otra opción");
	
		}
     }
 }
		
		
	


