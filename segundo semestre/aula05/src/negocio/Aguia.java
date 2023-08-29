package negocio;

public class Aguia extends Ave {
	// propriedade da classe
	private double autonomia = 0;

	// metodos construtores
	public Aguia() {
		super();
	}

	public Aguia(double peso, double altura, String nome, int quantidadeOvos, double autonomia) {
		super(peso, altura, nome, quantidadeOvos);
		this.autonomia = autonomia;
	}

	//metodos get/set
	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	
	// metodos da classe
	public void voar() {
		System.out.println("guiaaaa! voot!");
	}
}
