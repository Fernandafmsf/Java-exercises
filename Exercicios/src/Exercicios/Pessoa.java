package Exercicios;

public class Pessoa {
	private int idade;
	int anoNascimento;
	private String nome;
	
	public int calculaIdade(int ano) {
		this.anoNascimento=ano;
		this.idade= 2023-ano;
		return idade;
	}
	
	public int informaIdade() {
		return idade;
	}
	
	public String informaNome() {
		return this.nome;
	}
	
	public void ajudaAnoNascimento(int ano) {
		this.anoNascimento=ano;
	}
}

