package classeexecutavel;

import model.Conta;
import model.Pessoa;

public class ClasseExecutavel {

	public static void main(String[] args) {

		//Pessoa p1 = new Pessoa();
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
		

	}
}
