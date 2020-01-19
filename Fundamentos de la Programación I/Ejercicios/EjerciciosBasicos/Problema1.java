package EjerciciosBasicos;

public class Problema1 {

	public static void main(String[] args) {
		long n=Integer.parseInt(args[0]);
		System.out.println("el resultado es: " + fun(n));
	}
	public static long fun(long n){
		long valor=0, a, b=0;
		if (n==1 || n==2)
		valor=1;
		else{
			if (n%2!=0){
			a=fun((n+1)/2);
			b=fun((n-1)/2);
			valor=a*a-b*b;
			}else {
				a=fun(n/2+1);
				b=fun(n/2-1);
				valor=a*a-b*b;
			}
		}
		return valor;
	}
}
