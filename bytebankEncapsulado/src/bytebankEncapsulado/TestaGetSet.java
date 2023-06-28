package bytebankEncapsulado;

public class TestaGetSet {

	public static void main(String[] args) {
		//creating accounts
		Conta conta = new Conta(1347,2477);
		Conta conta2=new Conta(1377, 10);
		
		//conta.setNumero(1377);
		//showing number and agency from the account
		System.out.println("Numero: "+conta.getNumero());
		System.out.println("Agencia: "+conta.getAgencia());
		
		//creating clients and referring them to its accounts objects
		Cliente cliente2 = new Cliente("Felipe", "12345");
		conta2.setTitular(cliente2);

		Cliente cliente = new Cliente("Fabio","14245");
		conta.setTitular(cliente);
		
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCpf());
		
		System.out.println(conta2.getTitular().getNome());
		System.out.println(conta2.getTitular().getCpf());
		
		System.out.println("Contas criadas: "+Conta.getTotal());
		
	}

}
