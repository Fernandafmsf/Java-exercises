package sintaxe_variavel_fluxo;

public class TesteCondicional {

	public static void main(String[] args) {
		int idade = 17;
		int quantidadeDePessoas = 3; 
		if(idade >=18) {
			System.out.println("Voce tem mais de 18 anos.");
			System.out.println("Seja bem vindo");
		}else if(quantidadeDePessoas>=2) {
				System.out.println("Pode entrar ");
			}
		else {
			System.out.println("Você nao pode entrar ja que nao "
					+ "esta acompanhado nem tem 18 anos");
			
		}

	}

}
