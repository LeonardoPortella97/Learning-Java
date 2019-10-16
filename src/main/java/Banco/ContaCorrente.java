package Banco;

class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular=" + titular + "]";
	}

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
	 	this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas criadas:"+Conta.total);
		this.agencia=agencia;
		this.numero=numero;
		
	}
	

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		if (novoNumero <= 0) {
			System.out.println("NUMERO DE CONTA INVALIDO");
			return;
		} else {
			this.numero = novoNumero;
		}
	}
	
	public static int getTotal () {
		return Conta.total;
	}

	public void setAgencia(int novaAgencia) {
		if (novaAgencia <= 0) {
			System.out.println("NUMERO DE AGENCIA INVALIDO");
			return;
		} else {
			this.agencia = novaAgencia;
		}
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setTitular(Cliente novoTitular) {
		this.titular = novoTitular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

}
