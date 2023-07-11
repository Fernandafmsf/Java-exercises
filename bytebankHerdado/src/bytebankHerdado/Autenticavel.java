package bytebankHerdado;

//Interface autenticavel é vista como um contrato 
//quando assinamos um contrato, devemos implementar seus metodos abstratos na classe que assinou

public abstract interface Autenticavel {
	
	public void setSenha(int senha);
	
	public boolean autentica(int senha);
	
	

}
