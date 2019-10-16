package Arrays;
import DOitBank.Modelo.*;
import DOitBank.Testes.*;

public class ArrayReferencias {
	
	public static void main(String[] args) {
		
		Object [] referencias = new Object[5];
		
		
		ContaCorrente cc1 = new ContaCorrente (22,11);
		referencias [0] = cc1;
		ContaPoupanca cp2 = new ContaPoupanca (22,12);
		referencias [1] = cp2;
		         
		
		
		Object ref = referencias[1];
		
		System.out.println(((Conta) ref).getNumero());
		System.out.println(cp2.getNumero());
		
		
		
		
		
	}

}
