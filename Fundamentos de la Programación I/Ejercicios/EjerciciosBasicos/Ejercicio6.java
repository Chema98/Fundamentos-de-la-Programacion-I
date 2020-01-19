package EjerciciosBasicos;

public class Ejercicio6 {
	public static void main(String[] args) {
		metodoB(3);
	}

	public static void metodoB(int n) {
		if (n < 1)
			System.out.println('B');
		else {
			System.out.println('R');
			metodoB(n - 1);
		}
	}
}
