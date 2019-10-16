package DOitBank.Testes;

import DOitBank.Modelo.ContaCorrente;
import DOitBank.Modelo.SaldoInsuficiente;

public class TesteSaca {

	public static void main(String[] args) throws SaldoInsuficiente {
		ContaCorrente cc1 = new ContaCorrente (123,321);
		
		cc1.deposita(200);
		cc1.saca(210);
		
		System.out.println(cc1.getSaldo());

	}

}
