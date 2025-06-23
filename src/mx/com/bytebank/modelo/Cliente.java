package mx.com.bytebank.modelo;

public class Cliente implements Autenticable{
	
	private String nombre;
	private String telefono;
	private String documento;
	
	private AutenticacionUtil util;
	
	public Cliente() {
		this.util = new AutenticacionUtil();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	@Override
	public boolean iniciarSesion(String clave) {
		return util.iniciarSesion(clave);
	}
	@Override
	public String getClave() {
		return util.getClave();
	}
	@Override
	public void setClave(String clave) {
		util.setClave(clave);	
	}
	

}
