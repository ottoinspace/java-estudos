package negocio;

public class Fabricante {
	// propriedade da classe
	private String nome = "";

	//metodos construtores
	public Fabricante() {
		super();
	}

	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}

	// metodos get/set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
