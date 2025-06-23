package mx.com.bytebank.test;

import mx.com.bytebank.modelo.*;

public class TestCuentaExceptionRetirar {
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new CuentaAhorros(1,1);
		cuenta.depositar(200);
		try {
			cuenta.retirar(201);
		} catch (SaldoInsuficienteException e) {
			
			e.printStackTrace();
		}
		
	}

}
