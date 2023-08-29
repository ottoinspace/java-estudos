package negocio;

public class Carro extends Veiculo{
	// propriedad classe
	private boolean tetoSolar = false;
	
	// meotodos construtores
	public Carro() {
		super();
	}

	public Carro(String modelo, Fabricante objFabricante, String cor, boolean tetoSolar) {
		super(modelo, objFabricante, cor);
		this.tetoSolar = tetoSolar;
	}

	// metodos get/set
	public boolean getTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	
}
