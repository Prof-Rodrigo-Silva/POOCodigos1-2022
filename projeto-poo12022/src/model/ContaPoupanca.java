package model;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
		super();
	}
	public ContaPoupanca(Pessoa correntista, int cod, float saldo) {
		super(correntista, cod, saldo);
		
	}
	
	public boolean atualiazarSaldo(float juros) {
		return this.movimentar(juros, JUROS);
	}

}
