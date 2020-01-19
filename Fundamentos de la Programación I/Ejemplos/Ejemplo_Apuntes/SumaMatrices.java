package Ejemplo_Apuntes;
import java.util.Scanner;

public class SumaMatrices {
	 final static Scanner TECLADO=new Scanner(System.in);
	
	 public static void main(String[]args){
   
	int [][] Matriz1, Matriz2, MatrizSuma;
	int numfilas, numcolumnas;
	//pedir las dimensiones de la matriz
		System.out.println("Introduce el número de filas");
				numfilas=TECLADO.nextInt();
		System.out.println("Introduce el número de columnas");
				numcolumnas=TECLADO.nextInt();
	//crear las matrices		
			Matriz1=new int [numfilas][numcolumnas];
			Matriz2=new int [numfilas][numcolumnas];
			MatrizSuma=new int [numfilas][numcolumnas];
	//Cargar datos
			Matriz1=introducirDatos(numfilas,numcolumnas);
			Matriz2=introducirDatos(numfilas,numcolumnas);
	//Sumar Matrices
			MatrizSuma=sumarMatrices(Matriz1,Matriz2);
	//Mostrar resultados
			System.out.println("La Matriz 1 es");
			mostrarResultado(Matriz1);
			System.out.println("La Matriz 2 es");
			mostrarResultado(Matriz2);
			System.out.println("La Matriz Suma es");
			mostrarResultado(MatrizSuma);
	}

	private static void mostrarResultado(int[][] matriz1) {
		//Si el método no devuelve nada, aparece la palabra restringida void
		for (int i=0;i<matriz1.length;i++){
			for (int j=0;j<matriz1[0].length;j++){
				System.out.print(matriz1[i][j]+ "\t");
				
		}
			System.out.println();
		}
	}

	private static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
		int [][]matriz=new int[matriz1.length][matriz1[0].length];
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<matriz[0].length;j++){
				matriz[i][j]=matriz1[i][j]+matriz2[i][j];
			}
		}
		
		return matriz;
	}

	private static int[][] introducirDatos(int numfilas, int numcolumnas) {
		int [][] matriz=new int[numfilas][numcolumnas];
		for (int i=0;i<numfilas;i++){
			for(int j=0;j<numcolumnas;j++){
				System.out.println("Introduce el valor de la posicion" +i+ " ,"+j);
				matriz[i][j]=TECLADO.nextInt();
		}
		}
		return matriz;
	}
	
}
