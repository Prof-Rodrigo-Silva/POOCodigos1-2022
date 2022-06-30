package model;

public class Pessoa{
	
	private String nome;
	private int idade;
	private long cel;
	private Endereco endereco;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, int idade, long cel, Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.cel = cel;
		this.endereco = endereco;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	

}
