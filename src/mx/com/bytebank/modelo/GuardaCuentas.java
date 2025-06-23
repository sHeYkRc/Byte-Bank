package mx.com.bytebank.modelo;

public class GuardaCuentas {
	
	public static int indice = 0; 
	
	Cuenta[] cuenta = new Cuenta[10];

	public void adiccionar(Cuenta cc) {
		
		cuenta[indice] = cc;
		indice ++;
	}

	public Cuenta obtener(int indice) {
		return cuenta[indice];
	}
	
	
	

}
