package model;

public class ContaEspecial extends Conta{
	
	private float limite;
	
	public ContaEspecial() {
		super();
	}
	
	public ContaEspecial(Pessoa correntista, int cod, float saldo, float limite) {
		super(correntista, cod, saldo);
		this.limite = limite;
		
	}
		
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public boolean sacarEspecial(float valor) {
		float saldoComLimite = this.getSaldo() + limite;
		if(saldoComLimite - valor >= 0f) {
			super.movimentar(valor, SACAR);
			atualizarSaldoLimite(valor, saldoComLimite);
			return true;
		}
		return false;
	}
	
	public boolean atualizarSaldoLimite(float valor, float saldoComLimite) {
		if(this.getSaldo() - valor <= 0f) {
			this.setSaldo(0f);
			this.limite = saldoComLimite - valor;				
		}
		return true;
	}

}
