package mx.com.bytebank.modelo;

public class ControlBonificacion {

	private double suma;

	public double registrarSalario(Funcionario funcionario) {

		suma += funcionario.getBonificacion();
		System.out.println(suma);
		return suma;

	}



}
