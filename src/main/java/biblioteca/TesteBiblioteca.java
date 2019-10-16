package biblioteca;

import DOitBank.Modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
	 ContaCorrente c = new ContaCorrente (1223,1233);
	 
	 c.deposita(200);
	 
	 System.out.println(c.getSaldo());

	}

}
