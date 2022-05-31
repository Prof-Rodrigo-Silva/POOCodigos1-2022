package classeexecutavel;

import model.Conta;
import model.Pessoa;

public class ClasseExecutavel {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Conta c1 = new Conta();

		p1.nome = "Mario";
		p1.idade = 45;
		p1.cel = 999999999;
		p1.email = "teste@gmail.com";
		
		c1.correntista = "João";
		c1.id = 12345;

		System.out.println("Nome: " + p1);
		
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		System.out.println(p2.nome);

	}

}
