package bytebankComposto;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDoCliente = new Conta();
		System.out.println(contaDoCliente.getSaldo());
		
		//fazendo referencia do titular da classe conta sem precisar criar 
		//efetivamente uma variável para o objeto cliente
		contaDoCliente.titular=new Cliente();
		contaDoCliente.titular.nome = "Fernanda";
		System.out.println(contaDoCliente.titular.nome);

	}

}
