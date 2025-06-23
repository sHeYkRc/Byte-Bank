package mx.com.bytebank.modelo;

/**
 * Cuenta crea nuevas intancias de Cuenta o de las clases que la heredan.
 * @author beati
 * @version 1.0
 */

public abstract class Cuenta implements Comparable<Cuenta>{
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	
	/**
	 * Intancia una nueva cuenta sin parámetros
	 */
	public Cuenta() {
		
	}
	
	/**
	 * Instancia una cuenta usando agencia y numero
	 * @param agencia
	 * @param numero
	 */
	
	public Cuenta(int agencia, int numero) {
		this.numero = numero;
		if (agencia <= 0) {
			System.out.println("no se permite 0");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		total ++;
		System.out.println("El numero de cuentas creadas son " + total);
	}
	
	public abstract void depositar (double valor);

	/**
	 * Este metodo retira dinero de la cuenta
	 * si ocurre un error debuelve una excepcion
	 * @param monto
	 * @throws SaldoInsuficienteException
	 */
	public void retirar(double monto) throws SaldoInsuficienteException{
		
		if(saldo < monto) {
			throw new SaldoInsuficienteException("No tienes saldo suficiente");
		}
		
		saldo -= monto;
	}
	
	public boolean trasferir(double monto, Cuenta cuenta) {
		
		if(monto <= saldo) {
			
			try {
				this.retirar(monto);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
			cuenta.depositar(monto);
			return true;
		}else {
			return false;
		}
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	
//	public void setAgencia(int agencia) {
//		if(agencia > 0) {
//			this.agencia = agencia;
//		}else {
//			System.out.println("no se permiten valores negativos");
//		}
//	}
	
	public void setNumero(int numero){
		if(numero > 0) {
			this.numero = numero;
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	public Cliente getTitular() {
		
		return titular;
	}
	
	
	public static int getTotal() {
		return total;
	}
	
	@Override
	public String toString() {
		String cuenta = "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Titular: " + this.titular.getNombre();
		return cuenta;
	}
	
//	public boolean esIgual(Cuenta c) {
//		return this.agencia == c.getAgencia() &&
//				this.numero ==c.getNumero();
//	}
	
	@Override
	public boolean equals(Object obj) {
		Cuenta c = (Cuenta) obj;
		return this.agencia == c.getAgencia() &&
				this.numero ==c.getNumero();
	}
	
	@Override
	public int compareTo(Cuenta o) {
		
		return Integer.compare(this.agencia, o.getAgencia());
	}
	

}
