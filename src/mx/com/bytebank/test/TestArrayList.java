package mx.com.bytebank.test;

import java.util.ArrayList;

import mx.com.bytebank.modelo.Cuenta;
import mx.com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Cuenta> lista = new ArrayList<>();
		
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc1 = new CuentaCorriente(13, 22);
		Cuenta cc2 = new CuentaCorriente(11, 22);
		
		lista.add(cc);
		lista.add(cc1);
		
		Cuenta obtenerCuenta = (Cuenta) lista.get(0);
		
		System.out.println(obtenerCuenta);
		
		for(int i = 0; i < lista.size(); i++ ) {
			System.out.println("ciclo for: " + "Indice: " + i + " " +lista.get(i));
		}
		
		for(Cuenta l : lista) {
			System.out.println("indice: " + l );
		}
		
		Boolean contiene = lista.contains(cc2);
		
		if(contiene) {
			System.out.println("si");
		}else {
			System.out.println("nel prro");
		}
		
		if (lista.get(0).equals(cc2)) {
			System.out.println("es igual prro *usando esIgual *");
		}else {
			System.out.println("nel no es lo mismo ");
		}
		
		
	
	}

}
