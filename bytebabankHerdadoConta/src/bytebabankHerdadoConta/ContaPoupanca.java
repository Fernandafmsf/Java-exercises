package bytebabankHerdadoConta;

public class ContaPoupanca extends Conta {
	//quando herdamos uma classe que possui um construtor, devemos inicializar o construtor na classe
	//filha também, já que a classe filha não herda o construtor da class mãe 
	
	
	//inicializando um construtor e passando parametros do construtor da classe mae
	//fazemos referencia a classe mae através de "super"
	public ContaPoupanca(int agencia,int numero) {
		super(agencia,numero);
	}

}
