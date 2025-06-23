package mx.com.bytebank.test;

import mx.com.bytebank.modelo.*;

public class TestControlBonificacion {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setSalario(1000);
		Gerente gerente = new Gerente();
		gerente.setSalario(5000);
		ControlBonificacion bonificacion = new ControlBonificacion();
		bonificacion.registrarSalario(funcionario);
		bonificacion.registrarSalario(gerente);
		Contador contador = new Contador();
		contador.setSalario(1000);
		bonificacion.registrarSalario(contador);
	}

}
