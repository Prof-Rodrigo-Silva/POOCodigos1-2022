package model;

public final class ContaComum extends Conta{
	
	public ContaComum() {
		super();
	}
	public ContaComum(Pessoa correntista, int cod, float saldo) {
		super(correntista, cod, saldo);
		
	}
	
	/*@Override
	public boolean sacar(float valor) {
		if(this.getSaldo() - valor >= 0) {
			this.movimentar(valor, SACAR);
			return true;
		}
		return false;
	}*/
	
}
