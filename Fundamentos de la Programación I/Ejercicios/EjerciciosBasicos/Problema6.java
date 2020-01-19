package EjerciciosBasicos;

public class Problema6 {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		imprime(a,a.length);
	}

	public static void imprime(int a[], int n) {
		if (n > 0) {
			imprime(a, n - 1);
			System.out.print(a[n-1] + " ");
		}
	}
}
