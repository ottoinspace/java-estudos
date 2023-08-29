package negocio;

public class Leopardo extends Mamifero{
	private double velocidade = 0;

	// metodos construtores
	public Leopardo() {
		super();
	}

	public Leopardo(double peso, double altura, String nome, double litrosLeite, double velocidade) {
		super(peso, altura, nome, litrosLeite);
		this.velocidade = velocidade;
	}

	// metodos get/set
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	// metodos da classe
	public void correr() {
		System.out.println("miau miau");
	}
}
