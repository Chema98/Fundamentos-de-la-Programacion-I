package EjerciciosBasicos;

public class Ejercicio11 {
	public static void main(String[] args) {
		quehace(4);
	}

	public static void quehace(int n) {
		if (n > 1) {
			System.out.print(" " + n);
			quehace(n - 1);
			System.out.print(" " + n);
		}
	}
}
