package bytebankHerdado;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	//salario poderia ser protected para facilitar o acesso a suas informações
	//pelas classes filhas, mas não é comumente usado, então 
	//pegamos o salario na classe filha atraves do gettes com o super
	
	
	public double getBonificacao() {
		return this.salario*0.05;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
