package Ejemplos_Argumentos;

public class EjemploArgs {


	public static void main(String [] args) {
		
		//Ejemplo de uso de lo introducido por línea de argumentos
		
		String primero;
		String segundo;
		
			primero=args[0];
			segundo=args[1];
			
				System.out.println("El primer player es: "+primero);
				System.out.println("El segundo player es: "+segundo);
				
				//run as > Run configurations > Arguments (separados por espacios)
	}
}


