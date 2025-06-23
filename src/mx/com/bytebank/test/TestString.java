package mx.com.bytebank.test;

import mx.com.bytebank.modelo.CuentaAhorros;

public class TestString {
	
public static void main(String[] args) {
		
		String  nombre =  "Alura";
		System.out.println("Antes de replace: " + nombre);
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" Cursos online.");
		
		printLine(nombre = nombre.toUpperCase());
		printLine(nombre = nombre.toLowerCase());
		char letra = nombre.charAt(4);
		printLine(letra);
		int index = nombre.indexOf("l");
		printLine(index);
		printLine(new CuentaAhorros(1, 2));
		
		
		
		printLine(nombre);
		
	}
	
	public static void printLine(Object valor) {
		System.out.println(valor.toString());
	}

}
