package EjerciciosBasicos;

public class Ejercicio5 {
	public static void main(String[] args) {
		metodoA(3);
	}

	public static void metodoA(int n) {
		if (n < 1)
			System.out.println('B');
		else {
			metodoA(n - 1);
			System.out.println('R');
		}
	}
}
