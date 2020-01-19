package EjerciciosBasicos;

public class Ejercicio12 {
public static void main(String[] args){
	int a[]={1,2,3,4,5};
	enigma(a,a.length);
}

	public static void enigma(int a[], int i) {
		if (i == 0)
			return;
		else
			enigma(a, i - 1);
		System.out.print(a[i - 1]);
	}
}
