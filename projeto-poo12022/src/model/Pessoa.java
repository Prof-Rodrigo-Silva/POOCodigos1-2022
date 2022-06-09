package model;

public class Pessoa {
	
	private String nome;
	private int idade;
	private long cel;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int idade, long cel) {
		this.nome = nome;
		this.idade = idade;
		this.cel = cel;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getCel() {
		return cel;
	}
	public void setCel(long cel) {
		this.cel = cel;
	}	
	public void nomeIdade() {
		System.out.println("Nome: "+this.nome+ "| Idade: "+this.idade);
	}
	
	

}
