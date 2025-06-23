package mx.com.bytebank.test;

import mx.com.bytebank.modelo.CuentaCorriente;
import mx.com.bytebank.modelo.CuentaAhorros;

public class TestCuenta {
	
	public static void main(String[] args) {
		
		CuentaCorriente corriente = new CuentaCorriente(1, 2);
		CuentaAhorros ahorros = new CuentaAhorros(2, 3);
		corriente.depositar(2000);
		System.out.println("saldo inicial: " + corriente.getSaldo());
		System.out.println(corriente.trasferir(1000, ahorros));
		System.out.println(corriente.getSaldo());
		System.out.println(ahorros.getSaldo());
		
	}

}
