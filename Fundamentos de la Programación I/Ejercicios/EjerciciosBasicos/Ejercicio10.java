package EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio10 {
	private static Scanner TECLADO;

	public static void main(String[] args) {
		TECLADO = new Scanner(System.in);
		int n,valor;
		System.out.println("Introduzca el valor de n");
		n = TECLADO.nextInt();
		valor=restados(n);
		System.out.println(valor);
	}

	public static int restados(int n) {

		int valor = 0;
		if (n == 2) {
			valor = 0;
		} else {
			valor = n + restados(n - 2);
		}
		return valor;
	}

}
