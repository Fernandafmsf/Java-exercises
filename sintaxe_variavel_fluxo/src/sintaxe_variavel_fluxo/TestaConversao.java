package sintaxe_variavel_fluxo;

public class TestaConversao {
	public static void main(String[]args) {
		double salario =1270.50;
		int valor = (int) salario; 
		//está sendo feito casting através do '(int)'
		System.out.println(valor);
	}
}
