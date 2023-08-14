package negocio;

public class Tipo {
	// propriedade da classe
	private String descricao = "";
	
	// metodos construtores
	public Tipo() {
		super();
	}

	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	// get e set
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
