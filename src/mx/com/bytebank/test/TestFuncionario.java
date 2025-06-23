package mx.com.bytebank.test;

import mx.com.bytebank.modelo.Funcionario;
import mx.com.bytebank.modelo.Gerente;

public class TestFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Gerente();
		
		funcionario.setDocumento("dfeq9iok");
		funcionario.setNombre("Alan");
		funcionario.setSalario(2000);
		funcionario.setTipo(0);
		
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacion());
		
	}

}
