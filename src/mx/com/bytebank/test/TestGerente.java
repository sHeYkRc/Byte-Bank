package mx.com.bytebank.test;

import mx.com.bytebank.modelo.Gerente;

public class TestGerente {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
//		Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
//		gerente.setTipo(1);
//		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacion());
		
		
		
		gerente.setNombre("alan");
		gerente.setClave("12345678");
	
		
		
		System.out.println(gerente.iniciarSesion("12345678"));
		System.out.println(gerente.getNombre());
	}

}
