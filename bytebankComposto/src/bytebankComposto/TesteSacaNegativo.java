package bytebankComposto;

public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200)); 
		
		//a ideia é que isso seja proibido
		//conta.saldo=conta.saldo-101;
		conta.deposita(200);
		System.out.println(conta.getSaldo());
		
	}

}
