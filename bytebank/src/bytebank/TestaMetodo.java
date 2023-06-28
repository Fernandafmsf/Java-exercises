package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta(); // podemos utilizar o nome parecido com o da classe desde que seja em minusculo
		conta.deposita(50);
		conta.deposita(100);
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar= conta.saca(50);
		
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		//Método com referencia e retorno
		
		Conta contaDoPaulo = new Conta();
		Conta contaDaMarcela = new Conta();
		
		contaDoPaulo.deposita(200);
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(200, contaDoPaulo);
		
		if (sucessoTransferencia) {
			System.out.println("Transferência feita com sucesso");
			System.out.println("Conta do Paulo: "+ contaDoPaulo.saldo);
			System.out.println("Conta da Marcela: "+ contaDaMarcela.saldo);
			
		}else {
			System.out.println("Sem dinheiro suficiente");
		}
		
		
	}

}
