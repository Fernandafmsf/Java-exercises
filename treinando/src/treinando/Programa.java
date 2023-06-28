package treinando;

public class Programa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.ajustaAnoNascimento(1879);
		String nome1= pessoa1.informaNome("Albert Einstein");
		
		pessoa2.ajustaAnoNascimento(1643);
		String nome2= pessoa2.informaNome("Isaac Newton");
		
		System.out.println(nome1+" teria "+ pessoa1.calculaIdade()+
				" anos se ainda estivesse vivo");
		
		System.out.println(nome2+" teria "+ pessoa2.calculaIdade()+
				" anos se ainda estivesse vivo");
		
		Pessoa pessoa3= new Pessoa();
		pessoa3.faculdade= new Universidade();
		String faculdadePessoa3= pessoa3.faculdade.informarNomeFaculdade("UFRJ");
		String nomePessoa = pessoa3.informaNome("Fernanda");
		
		System.out.println(nomePessoa+" estuda na " + faculdadePessoa3);
		
	}
}
