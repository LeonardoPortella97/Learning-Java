package Heranca;

public class Colaborador {

	public static void main(String[] args) {
		
		// Criacao de Objeto
		Funcionario funcionarioUm = new Funcionario();
		Funcionario gerenteUm = new Gerente();
		
		
		// Atribuicao de Parametros
		funcionarioUm.setNome("Leonardo Gomes Portella");
		funcionarioUm.setCpf("335.316.398-03");
		funcionarioUm.setSalario(3000);
		funcionarioUm.setTipo(1);
		gerenteUm.setNome("Antonino Portella");
		gerenteUm.setCpf("013.459.338-35");
		gerenteUm.setSalario(1000);
		gerenteUm.setSenha(2222);
		gerenteUm.setTipo(1);
		
		
		// Saida 
		System.out.println(funcionarioUm.getNome());
		System.out.println(funcionarioUm.getBonus());
		System.out.println(gerenteUm.getNome());
		System.out.println(gerenteUm.getBonus());
		
		boolean autentica = gerenteUm.autentica(2222);
		System.out.println(autentica);
		
		System.out.println(funcionarioUm);
		System.out.println(gerenteUm);
		

	}

}
