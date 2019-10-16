package DOitBank.Modelo;

public class ContaCorrente extends Conta implements Autentica{
	
	
	
	
	private AutenticacaoUtil util;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		this.util = new AutenticacaoUtil();
		
	}

	
	@Override
	public void saca(double valor) throws SaldoInsuficiente {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}


	

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha); 

	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha); 
		}
	
	
}