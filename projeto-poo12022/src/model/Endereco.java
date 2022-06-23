package model;

public class Endereco {
	
	private String nomeRua;
	private int numero;
	private String bairro;
	
	public Endereco() {}
	
	public Endereco(String nome, int nr, String bairro) {
		this.nomeRua = nome;
		this.numero = nr;
		this.bairro = bairro;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	

}
