package sintaxe_variavel_fluxo;

public class Fatorial {

	public static void main(String[] args) {
		int n = 10;
		int fatorial=1;
		
		for(int contador =1;contador<=n;contador++) {
			fatorial=fatorial*contador;
			
			System.out.println("Fatorial de "+contador+ "="+fatorial);
			
		}
		

	}

}
