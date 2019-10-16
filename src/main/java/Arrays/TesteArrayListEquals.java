package Arrays;
import java.util.List;
import java.util.Vector;

import DOitBank.Modelo.Conta;
import DOitBank.Modelo.ContaCorrente;


public class TesteArrayListEquals extends Object {

public static void main(String[] args){
	
	List<Conta> lista = new Vector <Conta>();

    Conta cc1 = new ContaCorrente(22, 22);
    Conta cc2 = new ContaCorrente(22, 22);

    lista.add(cc1);
    
    boolean existe = lista.contains(cc2); //novo

    System.out.println("Já existe? " + existe);
    
    boolean igual = cc1.equals(cc2);
    System.out.println(igual);

    for(Conta conta : lista){
        System.out.println(conta);
        
        
    }
}
}