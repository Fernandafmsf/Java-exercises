package treinando;

public class Pessoa {
	private int idade;
	private int anoNascimento;
	private String nomePessoa;
	Universidade faculdade;
	
	public int calculaIdade() {
		this.idade= 2023-this.anoNascimento;
		return idade;	
	}
	
	public int informaIdade() {
		return idade;
	}
	
	public String informaNome(String nome) {
		this.nomePessoa=nome;
		return nome;
	
	}
	
	public void ajustaAnoNascimento(int ano) {
		this.anoNascimento=ano;
	}
	
	
}

