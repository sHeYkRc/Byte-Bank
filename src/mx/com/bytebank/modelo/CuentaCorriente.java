package mx.com.bytebank.modelo;

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente (int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void retirar(double monto) throws SaldoInsuficienteException {
		double comicion = 0.2;
		super.retirar(monto + comicion);
	}

	@Override
	public void depositar(double valor) {
		this.saldo = valor;
		
	}

}
