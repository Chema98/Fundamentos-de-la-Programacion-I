package EjerciciosBasicos;
public class Problema8 {
public static void main(String[] args){
	int n=4;
	System.out.println(recur(n));
}
public static int recur(int n){
	int valor;
	if (n==1){
		valor =2;
	}else{
		valor= (n-2)*recur(n-1);
	}
	return valor;
}
}
