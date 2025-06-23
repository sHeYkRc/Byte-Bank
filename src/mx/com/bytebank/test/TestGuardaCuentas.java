package mx.com.bytebank.test;

import mx.com.bytebank.modelo.Cuenta;
import mx.com.bytebank.modelo.CuentaCorriente;
import mx.com.bytebank.modelo.GuardaCuentas;

public class TestGuardaCuentas {
	
	public static void main(String[] args) {
		
		GuardaCuentas gc = new GuardaCuentas();
		
		Cuenta cc = new CuentaCorriente(22, 11);
		Cuenta cc1 = new CuentaCorriente(23,55);
		gc.adiccionar(cc);
		gc.adiccionar(cc1);
		
		System.out.println(gc.obtener(0));
		System.out.println(gc.obtener(1));
		gc.adiccionar(new CuentaCorriente(11, 48));
		System.out.println(GuardaCuentas.indice);
		
	}

}
