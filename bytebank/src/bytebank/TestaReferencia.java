package bytebank;

public class TestaReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		Conta segundaConta = primeiraConta; // aqui criamos uma conta
//que recebe o valor da var primeiraConta. O valor dessa var 
//é um numero referencia ao endereço do objeto do tipo conta 
//sendo assim, ambas variáveis ficam referenciando o mesmo objeto
		
		
		segundaConta.saldo = 50;
		
		System.out.println(segundaConta); // referencia ao objeto
		System.out.println(primeiraConta);
		
		if(primeiraConta==segundaConta) {
			System.out.println("Sao a mesma conta");
		}
	}
}
