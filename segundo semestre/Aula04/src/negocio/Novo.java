package negocio;

public class Novo extends Imovel{
	// propriedade da classe
	private double adicional = 0;

	// metodos construtores
	public Novo() {
		super();
	}

	public Novo(String endereco, double metragem, double valor, double adicional) {
		super(endereco, metragem, valor);
		this.adicional = adicional;
	}

	//metodos get/set
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	// metodos da classe
	public double getValor() {
		return (super.getValor() + (super.getValor() * this.getAdicional()));
	}
}
