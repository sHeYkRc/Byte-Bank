package mx.com.bytebank.modelo;

public interface Autenticable{
	

	public String getClave();

	public void setClave(String clave);

	public abstract boolean iniciarSesion(String clave);


}
