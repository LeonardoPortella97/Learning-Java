package Banco;

public class CriaConta {
	public static void main(String[] args) {

		// Criacao de objeto

		Conta primeiraConta = new Conta(0,0);
		Conta segundaConta = new Conta(0,0);
		Conta terceiraConta = new Conta(0,0);

		// Composicao de Objeto

		Cliente clienteUm = new Cliente();
		clienteUm.nome = "Leonardo Gomes Portella";
		clienteUm.cfp = "335.316.398-03";
		clienteUm.profissao = "Estagiario";

		Cliente clienteDois = new Cliente();
		clienteDois.nome = "Mayara Gomes Portella";
		clienteDois.cfp = "335.334.322-03";
		clienteDois.profissao = "Representante Tecnica";

		// Metodos
		segundaConta.deposita(12000);
		primeiraConta.saca(200);
		primeiraConta.transfere(1200, segundaConta);
		primeiraConta.deposita(20000);

		// Getters e Setters
		primeiraConta.setTitular(clienteUm);
		primeiraConta.setNumero(27636);
		primeiraConta.setAgencia(1373);
		segundaConta.setTitular(clienteDois);
		segundaConta.setNumero(546463);
		segundaConta.setAgencia(2353);

		// Metodo com Retorno
		boolean conseguiuRetirar = primeiraConta.saca(12000);

		// Metodo com Referencia
		if (primeiraConta.transfere(1200, segundaConta)) {
			System.out.println("Tranferencia Autorizada");
			System.out.println();
		} else {
			System.out.println("Tranferencia Negada");
			System.out.println();

		}

		// Saida

		System.out.println("*****************************");
		System.out.println();
		System.out.println("Dados da primeira conta:");
		System.out.println("Cliente:" + clienteUm.nome);
		System.out.println("CPF:" + clienteUm.cfp);
		System.out.println("Profissao:" + clienteUm.profissao);
		System.out.println("Titular:" + primeiraConta.getTitular().nome);
		System.out.println("Numero da Conta:" + primeiraConta.getNumero());
		System.out.println("Agencia:" + primeiraConta.getAgencia());
		System.out.println("Saldo em R$:" + primeiraConta.getSaldo());
		System.out.println(conseguiuRetirar);
		System.out.println();
		System.out.println("*****************************");
		System.out.println();
		System.out.println("Dados da Segunda conta:");
		System.out.println("Cliente:" + clienteDois.nome);
		System.out.println("CPF:" + clienteDois.cfp);
		System.out.println("Profissao:" + clienteDois.profissao);
		System.out.println("Titular:" + segundaConta.getTitular().nome);
		System.out.println("Numero da Conta:" + segundaConta.getNumero());
		System.out.println("Agencia:" + segundaConta.getAgencia());
		System.out.println("Saldo em R$:" + segundaConta.getSaldo());
		System.out.println(conseguiuRetirar);
		System.out.println();
		System.out.println("*****************************");
		System.out.println("Total de contas criadas:" + Conta.getTotal());

	}

}