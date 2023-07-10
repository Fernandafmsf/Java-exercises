package bytebankHerdado;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setCpf("1234684");
		g1.setSalario(5000.0);
		g1.setSenha(1234);
		
		boolean autentica = g1.autentica(1234);
		
		if(autentica) {
			System.out.println(g1.getBonificacao());
			System.out.println(g1.getCpf());
			System.out.println(g1.getNome());
		}else {
			System.out.println("Senha inváida");
		}
		
		System.out.println(g1.getBonificacao());

	}

}
