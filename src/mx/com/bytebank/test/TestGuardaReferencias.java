package mx.com.bytebank.test;

import mx.com.bytebank.modelo.Administrador;
import mx.com.bytebank.modelo.Cliente;
import mx.com.bytebank.modelo.Cuenta;
import mx.com.bytebank.modelo.CuentaCorriente;
import mx.com.bytebank.modelo.Funcionario;
import mx.com.bytebank.modelo.GuardaReferencias;

public class TestGuardaReferencias {
	
	public static void main(String[] args) {
		
		
		GuardaReferencias gr = new GuardaReferencias();
		
		Cuenta cc = new CuentaCorriente(22,33);
		Cliente c = new Cliente();
		Funcionario f = new Administrador();
		Administrador a = new Administrador();
		
		gr.adiccionar(cc);
		gr.adiccionar(c);
		gr.adiccionar(f);
		gr.adiccionar(a);
		
		System.out.println(gr.obtener(0));
		System.out.println(gr.obtener(1));
		System.out.println(gr.obtener(2));
		System.out.println(gr.obtener(3));
	}

}
