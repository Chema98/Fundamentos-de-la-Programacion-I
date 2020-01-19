package Ejemplo_Apuntes;
import java.util.Scanner;

public class Matriz {
	
		static Scanner leer = new Scanner(System.in);
		public static void main(String[]args){
			
				//Ejemplo para crear una matriz bidimensional con el número de filas y columnas que quiera el usuario
				
				//¡Para recorrer una matriz de 'n' dimensiones se usarán 'n' bucles!
			
				int filas=0;
				int columnas=0;
				
					System.out.println("Introduce el número de filas de la matriz: ");
							filas= leer.nextInt();
					System.out.println("Introduce el número de columnas de la matriz: ");
							columnas= leer.nextInt();
							
				int [][] tabla = new int [filas][columnas];
				
					//Solicitar el valor al usuario de cada uno de los elementos de la matriz
				
					for(int i=0; i<tabla.length; i++){
						for(int j=0; j<tabla[i].length; j++){
							System.out.println("Introduzca el valor para la fila "+i+" y la columna "+j);
							tabla[i][j]= leer.nextInt();
							
						}
					}
					
					//Imprimir el valor de cada uno de los elementos de la matriz
					
					for (int i=0; i<tabla.length; i++){
						for(int j=0; j<tabla[i].length;j++){
							System.out.print(tabla[i][j]);
						}
									System.out.println();
					}
		}
		
}
