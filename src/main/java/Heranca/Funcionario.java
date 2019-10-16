package Heranca;

public class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	private int tipo = 0; // Tipo: 0 = Funcionario Comum / 1 = Gerente / 2 = Diretor

	public double getBonus() {
		if (this.tipo==0) {
			return this.salario * 0.1;
		   } else if (this.tipo==1) {
				return this.salario*2;
			   } else {
				return this.salario + 10000.0;
			  
		}
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo(int tipo) {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public boolean autentica (int senha) {
			return false;
	}

	public void setSenha(int senha) {
		// Do nothing
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", tipo=" + tipo + "]";
	}
	

}
