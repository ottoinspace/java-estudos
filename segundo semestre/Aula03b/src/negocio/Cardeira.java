package negocio;

public class Cardeira {
	// propriedade da classe
	private String nome = "";

	// metodos construtores
	public Cardeira() {
		super();
	}

	public Cardeira(String nome) {
		super();
		this.nome = nome;
	}

	// metodos get e set
	public String getNome() {
		return nome;
	}

	public void setNomeProfessor(String nome) {
		this.nome = nome;
	}
	
}
