package EjerciciosBasicos;
public class Problema7 {
	public static void main(String[] args){
		int n;//Hay que darle un valor a n para que funcione
	//	System.out.println(catalan(n));
	}
	public static int catalan(int n){
		int valor;
		if (n==0){
			valor=1;
		}else{
			valor=2*(2*n-1)*catalan(n-1)/(n+1);
		}
		return valor;
	}
}
