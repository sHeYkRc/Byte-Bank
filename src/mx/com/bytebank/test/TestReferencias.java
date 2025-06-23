package mx.com.bytebank.test;

import mx.com.bytebank.modelo.Funcionario;
import mx.com.bytebank.modelo.Gerente;
public class TestReferencias {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Gerente();
		Funcionario gerente = new Gerente();
		funcionario.setNombre("Alan");
		funcionario.setSalario(3000);
		gerente.setNombre("linda");
		gerente.setSalario(2000);
		
		
		System.out.println(gerente.getBonificacion());
	
	
	}

}
