package negocio;

public class Cachorro extends Mamifero{
	// propriedade classe
	private double forcaMordida = 0;

	// metodos construtores
	public Cachorro() {
		super();
	}

	public Cachorro(double peso, double altura, String nome, double litrosLeite, double forcaMordida) {
		super(peso, altura, nome, litrosLeite);
		this.forcaMordida = forcaMordida;
	}
	
	// metodos get/set
	public double getForcaMordida() {
		return forcaMordida;
	}

	public void setForcaMordida(double forcaMordida) {
		this.forcaMordida = forcaMordida;
	}
	
	// metodos da classe
	public void morde() {
		System.out.println("woof! woof! woof!");
	}
}
