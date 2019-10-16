package Arrays;

import DOitBank.Modelo.*;

import DOitBank.Testes.*;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int livre;
	
	public GuardadorDeContas () {
		this.referencias = new Conta[10];
		this.livre=0;
	}

	public void adicionar(Conta ref) {
		this.referencias[this.livre]=ref;
		this.livre++;
		
		
	}

	public int getQuantidade() {
		return this.livre;
	}

	public Conta getReferencia(int livre) {
		
		return this.referencias[livre];
	}
	

}
