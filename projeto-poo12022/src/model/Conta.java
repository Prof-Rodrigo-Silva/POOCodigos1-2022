package model;

public class Conta {
	
	private Pessoa correntista;
	private int codigo;
	private float saldo;
		
	public Conta() {}
	
	public Conta(Pessoa correntista, int codigo, float saldo) {
		this.correntista = correntista;
		this.codigo = codigo;
		this.saldo = saldo;
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
	
	public boolean sacar(float valor) {
		if(this.saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			return true;
		}
		return false;
	}
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	

}
