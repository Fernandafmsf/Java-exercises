package bytebabankHerdadoConta;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; //conecta classe conta a classe titular
	private static int total =0;
	
	
	//Construtor, executado assim que o objeto é inicializado
	public Conta(int agencia, int numero) {
		Conta.total++;
		
		if(agencia<=0 || numero<=0) {
			System.out.println("Não pode numero negativo");
		
		}else {
			this.agencia=agencia;
			this.numero=numero;
			System.out.println("Criando uma conta");
		}
		
	}
	
	public void deposita (double valor) {
		this.saldo = this.saldo+valor; // this referencia atributos da classe
		
	}
	
	public boolean saca (double valor) {
		if (this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	
	
	public int getAgencia() {
		return this.agencia;
	}
	
	
	
	
	//referencia ao titular 
	//a variavel no parametro tem que ser do tipo titular
	public void setTitular(Cliente titular) {
		this.titular=titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	//dizer que é static faz com que ao invocá-los no main, não precisaremnos 
	//definir o objeto, poderemos usar o nome da classe mesmo
	public static int getTotal() {
		return Conta.total;
	}
}
