package bytebabankHerdadoConta;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	private static int quantidadeClientes;
	
	public Cliente(String nome, String cpf){
		Cliente.quantidadeClientes++;
		this.nome=nome;
		this.cpf=cpf;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	
	public void setProfissao(String profissao) {
		this.profissao=profissao;
	}
	
}
