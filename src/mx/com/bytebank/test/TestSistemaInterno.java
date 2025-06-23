package mx.com.bytebank.test;

import mx.com.bytebank.modelo.*;

public class TestSistemaInterno {
	
	public static void main(String[] args) {
		
		SistemaInterno interno = new SistemaInterno();
		Gerente gerente = new Gerente();
		Administrador administrador = new Administrador();
		
		gerente.setClave("1234567");
		administrador.setClave("12345");
		
		interno.autenticar(gerente, "1234567");
		interno.autenticar(administrador, "12345");
		
	}

}
