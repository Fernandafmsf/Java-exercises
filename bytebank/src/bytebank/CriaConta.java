package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // declarando a variável do tipo conta para poder acessar os seus atributos 
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);//para acessar os atributos, eles tem que ser atribuidos antes. Se nao tiver valor, não podemos exibi los
		
		primeiraConta.saldo+=100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem "+primeiraConta.saldo);
		System.out.println("Segunda conta tem "+segundaConta.saldo);
		
		System.out.println(primeiraConta.numero);
		
	}
}
