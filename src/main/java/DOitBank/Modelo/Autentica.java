package DOitBank.Modelo;


// Classe que assina o contrato precisa implementar:
// setSenha
// autenticas

public abstract interface Autentica {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica (int senha);

}

