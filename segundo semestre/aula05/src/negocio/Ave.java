package negocio;

public abstract class Ave extends Animal{
	//propriedade classe
	private int quantidadeOvos = 0;

	// metodos construtores
	public Ave() {
		super();
	}

	public Ave(double peso, double altura, String nome, int quantidadeOvos) {
		super(peso, altura, nome);
		this.quantidadeOvos = quantidadeOvos;
	}

	// metodos get/set
	public int getQuantidadeOvos() {
		return quantidadeOvos;
	}

	public void setQuantidadeOvos(int quantidadeOvos) {
		this.quantidadeOvos = quantidadeOvos;
	}
	

}
