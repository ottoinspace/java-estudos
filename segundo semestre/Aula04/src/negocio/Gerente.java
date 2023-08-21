package negocio;

public class Gerente extends Colaborador{
	// propriedade da classe
	private double bonus = 0;

	// metodos construtores
	public Gerente() {
		super();
	}
	

	public Gerente(int matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario);
		this.bonus = bonus;
	}
	
	// metodos get/set
	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	// metodos sobrescritos da classe
	public double getSalario() {
		return (super.getSalario() + this.getBonus()); // super e uma referencia pro pai e o this para si mesmo
	}
}
