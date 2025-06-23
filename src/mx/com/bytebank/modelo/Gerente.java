package mx.com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable{
	
	private AutenticacionUtil util;
	
	public Gerente() {
		this.util = new AutenticacionUtil();
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

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}
}
