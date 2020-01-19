package Ejemplos_Argumentos;

public class EjemploArgumento {

	public static void main(String [] args) {
		
		//Ejemplo de uso de lo introducido por línea de argumentos
		
		String primero;
		String segundo;
		
			primero=args[0];
			segundo=args[1];
			
				System.out.println("El primer player es: "+primero);
				System.out.println("El segundo player es: "+segundo);
	}
}
