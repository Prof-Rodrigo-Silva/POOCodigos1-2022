package classeexecutavel;

import model.Conta;
import model.Endereco;
import model.Pessoa;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Endereco ed1 = new Endereco();
		ed1.setNomeRua("Rua da Quebrada");
		ed1.setNumero(139);
		ed1.setBairro("São Judas");
		Pessoa p1 = new Pessoa("José", 32, 999887766, ed1);
		
		Pessoa p2 = new Pessoa();
		
		/*p1.setNome("José");
		p1.setIdade(32);
		p1.setCel(999887766);
		p1.setEndereco("Rua da Quebrada!");*/
		
		p2.setNome("Maria");
		p2.setIdade(18);
		p2.setCel(999112233);
		//p2.setEndereco("Rua das cocotinhas!");
		//System.out.println(p1.getNome());
		//System.out.println(p2.getNome());
		Conta c1 = new Conta();
		c1.setCodigo(112233);
		c1.setSaldo(10570.97f);
		c1.setCorrentista(p1);
		
		System.out.println(c1.getSaldo());
		System.out.println(c1.getCorrentista().getNome());
		System.out.println(c1.getCorrentista().getIdade());
		
		c1.getCorrentista().setIdade(45);
		System.out.println(c1.getCorrentista().getIdade());
		
		Conta c2 = new Conta(p2, 998877, 450000f);
		
		//c2.setCodigo(998855);
		//c2.setSaldo(500f);
		//c2.setCorrentista(p1);
		
		System.out.println(c2.getCodigo());
		
		System.out.println(c2.getCorrentista().getNome()+" "+c2.getCorrentista().getEndereco());
		
		System.out.println(c1.getCorrentista().getEndereco().getBairro());
		
		/*Pessoa p1 = new Pessoa();
		p1.setNome("Rodrigo");
		p1.setIdade(39);
		
		
		
		//p1.nomeIdade();
		
		Conta c1 = new Conta();
		
		c1.setId(1234);
		c1.setCorrentista("Mario");
		c1.setSaldo(1577.00f);
		
		System.out.println("Correntista: "+c1.getCorrentista());
		System.out.println("Id Conta: "+c1.getId());
		System.out.println("Saldo: R$ "+c1.getSaldo());
		
		
		if(c1.sacar(500.30f)) {
			System.out.println("Sacou!!!! Saldo atualizado R$: "+c1.getSaldo());
		}else {
			System.out.println("Opa, saque não realizado!!");
		}	
*/
	}
}
