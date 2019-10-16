package Arrays;
import java.util.ArrayList;

import DOitBank.Modelo.*;
import DOitBank.Testes.*;
import DOitBank.*;

public class Generics {
	
 public static void main(String[] args) {
	ArrayList<Conta> lista = new ArrayList<Conta>();
	
	Conta cc1 = new ContaCorrente(22,3948);
	lista.add(cc1);
	
	Conta cc2 = new ContaCorrente (63,3323);
	lista.add(cc2);
	
	System.out.println("Tamanho:" + lista.size());
	for (Conta conta : lista) {
		System.out.println(conta);
		
	}
	
	
	

 }

}
