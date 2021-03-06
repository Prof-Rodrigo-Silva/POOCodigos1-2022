package model;

public abstract sealed class Conta permits ContaComum, ContaEspecial, ContaPoupanca{
	
	protected Pessoa correntista;
	protected int codigo;
	protected float saldo;
	protected static int numeroContas;
	protected final static int NUMEROAGENCIA = 1122;
	public final int SACAR = 0;
	public final int DEPOSITAR = 1;
	public final int JUROS = 2;
		
	public Conta() {
		this.numeroContas++;
	}
	
	public Conta(Pessoa correntista, int codigo, float saldo) {
		this.correntista = correntista;
		this.codigo = codigo;
		this.saldo = saldo;
		this.numeroContas++;
	}
	
	public Pessoa getCorrentista() {
		return correntista;
	}
	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public final boolean sacar(float valor) {
		if(this.saldo - valor >= 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public final boolean depositar(float valor) {
		this.saldo += valor;
		return true;
	}
	
	public final boolean movimentar(float valor, int opcao) {
		if(opcao == SACAR) {
			if(this.sacar(valor)) {
				return true;	
			}else {
				return false;
			}
		}else if(opcao == DEPOSITAR) {
			if(this.depositar(valor)) {
				return true;
			}
			return false;
		}else if(opcao == JUROS) {
			this.depositar(valor);
			return true;
		}
		return false;
	}
	
	public static final int getNumeroContas() {
		return numeroContas;
	}
	public static final int getNumeroAgencia() {
		return NUMEROAGENCIA;
	}
	

}
