package bytebankHerdado;

//criar uma classe que verifica se o funcionario pode entrar no sistema 


public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {//usando interface como referencia
		boolean autenticou = fa.autentica(this.senha);//pega a função autentica da classe funcionarioautenticavel 
		
		if(autenticou) {
			System.out.println("Pode entrar");
		}else {
			System.out.println("Não pode entrar");
		}
	}
	
}
