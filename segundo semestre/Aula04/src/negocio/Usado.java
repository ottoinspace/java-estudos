package negocio;

public class Usado extends Imovel{
	// propriedade da classe
	private double depreciacao = 0;

	// metodos construtores
	public Usado() {
		super();
	}

	public Usado(String endereco, double metragem, double valor, double depreciacao) {
		super(endereco, metragem, valor);
		this.depreciacao = depreciacao;
	}

	// metodos get/set
	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	// metodos da classe
	public double getValor() {
		return(super.getValor() - (super.getValor() * this.getDepreciacao()));
	}
}
