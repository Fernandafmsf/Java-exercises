package bytebankHerdado;

public class Designer extends Funcionario {
	private int senha;
	
	public void setSenha(int senha) {
		this.senha=senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha==senha) {
			return true;
		}else {
			return false;
		}
	}
	
	//método reescrito da classe mãe
	//super é usado para pegar metodos e atributos da classe mae 
	public double getBonificacao() {
		return 200;
	}
	//ao pegar o método bonificação da classe mae, tornamos o código mais pratico
}
