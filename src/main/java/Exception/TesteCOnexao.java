package Exception;

public class TesteCOnexao {

	public static void main(String[] args) {
		
		try (Conexao conex = new Conexao()) {
			conex.leDados();
		} catch (IllegalStateException ex) {
		System.out.println("Deu Erro na conexao");
		
			
		
	}
}
		
}


		//------------------
		
//		Conexao conex = null;
//		try {
//			conex = new Conexao();
//			conex.leDados();
//			conex.close();
//		} catch(IllegalStateException ex) {
//			System.out.println("Erro na Conexao");
//			
//		} finally {
//			conex.close();
//			
//		}
//
//	}
