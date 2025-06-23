package mx.com.bytebank.test;

import mx.com.bytebank.modelo.Cliente;

import mx.com.bytebank.modelo.CuentaAhorros;
import mx.com.bytebank.modelo.CuentaCorriente;

public class TestArrayReferencias {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("Argumentos: " + i + " args: " + args[i]);
		}
		
		Object[] referencias = new Object[5];
		
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		referencias[1] = cc;
		
		System.out.println("intancia sin guardar: " + cc);
		System.out.println("referencia del indice 2: " + referencias[1]);
		
		
		referencias[0] = new CuentaCorriente(23, 34);
		
		System.out.println("objeto asigando explisitametne: " + referencias[0]);
		
		CuentaAhorros ca = new CuentaAhorros(44, 55);
		
		referencias[3] = ca;
		
		CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
		
		Cliente obetenido = (Cliente) referencias[4];
		
		System.out.println("Cast de Cuenta a CuentaCorriente: " + cuenta);
		System.out.println("Cliente en un array que era de cuentas: " + cliente);
		System.out.println("Cliente recuperado del array tipo Object: " + obetenido);

		for (int i = 0; i < referencias.length; i++) {
			System.out.println("Indice: " + i + " Tiene la Cuenta: " + referencias[i]);
		}
		
		
	}

}
