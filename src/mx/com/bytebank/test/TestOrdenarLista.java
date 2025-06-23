package mx.com.bytebank.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mx.com.bytebank.modelo.Cliente;
import mx.com.bytebank.modelo.Cuenta;
import mx.com.bytebank.modelo.CuentaAhorros;
import mx.com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {
	
	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(62, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaAhorros(32, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Renato");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaAhorros(2, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Noel");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

		List <Cuenta> lista = new ArrayList<>();

		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		System.out.println("antes de ordenar");
		for(Cuenta c : lista) {
			System.out.println(c);
		}
		
		//Comparator<Cuenta> comparator = new OrdenadorPorNumerosCuenta();
		//lista.sort(comparator);
		lista.sort(new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
		});
		
		System.out.println("Despues de ordenar");
		for (Cuenta c : lista) {
			System.out.println(c);
		}
		
		//Comparator<Cuenta> comparatorN = new OrdenarPorTitular();
		lista.sort(new OrdenarPorTitular());
		System.out.println("Despude de ordenar por nombre");
		for(Cuenta c :  lista) {
			System.out.println(c);
		}
		
		Collections.sort(lista, new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}
		});
		System.out.println("Ordenado por collection, mediante la lista y ordenarportitular");
		for (Cuenta c : lista) {
			System.out.println(c);
		}
		
		Collections.sort(lista);
		System.out.println("Ordenamiento por numero de agencia");
		for(Cuenta c : lista) {
			System.out.println(c);
		}
		

		
		
	}

}


class OrdenadorPorNumerosCuenta implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		
//		if(o1.getNumero() == o2.getNumero()) {
//			return 0;
//		}else if(o1.getNumero() > o2.getNumero()) {
//			return 1;
//		}else {
//			return -1;
//		}
		
		//return o1.getNumero() - o2.getNumero();
		
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
	
}

class OrdenarPorTitular implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
	}
	
}
