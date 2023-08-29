package negocio;

public class Estante {
    // propriedade da classe
    private int numero = 0;

    // metodo construstor 
	public Estante() {
		super();
	}

	public Estante(int numero) {
		super();
		this.numero = numero;
	}
	
	// meotodo get/set classe

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
