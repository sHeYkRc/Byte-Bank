package mx.com.bytebank.modelo;

public class AutenticacionUtil {
	
	private String clave;
	
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
	
	public void setClave (String clave) {
		this.clave = clave;
	}
	
	public String getClave() {
		return this.clave;
	}

}
