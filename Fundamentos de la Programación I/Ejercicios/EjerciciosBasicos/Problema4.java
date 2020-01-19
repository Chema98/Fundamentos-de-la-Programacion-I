package EjerciciosBasicos;

public class Problema4 {
 
	public static int recur(int limite, int factor){
		int suma=1;
		if (limite>0){
			suma=2*recur(limite,factor);
		}else{
			suma=1;
		}
		return suma;
	}

}
