package Arrays;

import DOitBank.Modelo.Conta;

import DOitBank.Modelo.ContaCorrente;
import Arrays.GuardadorDeContas; 

public class Teste {
	
	//Array
	 
	public static void main(String[] args) {
		
	GuardadorDeContas guardador = new GuardadorDeContas();
	
	
	Conta cc1 = new ContaCorrente (22,11);
	guardador.adicionar(cc1);
	Conta cc2 = new ContaCorrente (22,34);
	guardador.adicionar(cc2);
	
	
	int tamanho = guardador.getQuantidade();
	System.out.println(tamanho);
	
	Conta ref = guardador.getReferencia(0);
	System.out.println(ref.getNumero());
	
	
	
	
	}
	
}