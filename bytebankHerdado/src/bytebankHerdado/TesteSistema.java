package bytebankHerdado;

public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		Administrador a1 = new Administrador();
		Autenticavel referencia = new Cliente();
		
		g1.setSenha(2222);//o setsenha é um metodo da classe gerente
		a1.setSenha(333);
		referencia.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g1);
		si.autentica(a1);
		si.autentica(referencia);
		

	}

}
