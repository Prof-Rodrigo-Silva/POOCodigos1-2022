package model;

import java.util.Objects;

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

	@Override
	public String toString() {
		return "Dados do Endereco {nomeRua=" + nomeRua +
				", numero=" + numero + 
				", bairro=" + bairro + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bairro, nomeRua, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(nomeRua, other.nomeRua) && numero == other.numero;
	}
	
	
	
	
	

}
