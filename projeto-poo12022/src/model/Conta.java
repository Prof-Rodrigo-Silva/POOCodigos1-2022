package model;

public class Conta {
	
	private String correntista;
	private int id;
	private float saldo;
	
	
	
	public String getCorrentista() {
		return correntista;
	}
	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
