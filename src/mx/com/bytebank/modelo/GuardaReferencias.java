package mx.com.bytebank.modelo;

public class GuardaReferencias {
	
	int indice = 0;
	
	Object[] r = new Object[10];
	
	public void adiccionar(Object referencia) {
		
		r[indice] = referencia;
		indice ++;
	}
	
	public Object obtener(int indice) {
		return r[indice];
	}

}
