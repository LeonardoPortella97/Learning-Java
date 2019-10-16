package DOitBank.Testes;

import DOitBank.Modelo.ContaCorrente;
import DOitBank.Modelo.ContaPoupanca;
import DOitBank.Modelo.SaldoInsuficiente;

public class Testes {

	public static void main(String[] args) throws SaldoInsuficiente {
		ContaCorrente cc1 = new ContaCorrente(111,111);
		cc1.deposita(100.0);
		
		ContaPoupanca cp1  = new ContaPoupanca(222,222);
		cp1.deposita(200.0);
		cc1.saca(10.0);
		cc1.transfere(10.0, cp1);
		
		cp1.transfere(10.0, cc1);
	
		cc1.setSenha(222);
		
		System.out.println(cp1);
		
		System.out.println("CC:"+cc1.getSaldo());
		System.out.println("CP:"+cp1.getSaldo());
	
	
	}

}
