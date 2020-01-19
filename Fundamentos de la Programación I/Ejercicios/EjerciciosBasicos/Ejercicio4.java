package EjerciciosBasicos;
public class Ejercicio4 {
	public static void main(String[] args) {
		int[] mat = { 6, 5, 4, 3, 2, 1 };
		metodo1(4, mat);
	}

	private static void metodo1(int posicion, int[] mat) {
		int valor = 0;
		if (posicion == 0) {
			System.out.println(valor);
		} else {
			posicion--;
			metodo1(posicion, mat);
			System.out.println(mat[posicion]);
		}
	}

}
