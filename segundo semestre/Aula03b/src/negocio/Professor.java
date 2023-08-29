package negocio;

public class Professor {
	// propriedade da classe
	private String nomeProfessor = "";
	private String titulo = "";
	private double salario = 0;
	
	// metodos construtores
	public Professor() {
		super();
	}
	public Professor(String nomeProfessor, String titulo, double salario) {
		super();
		this.nomeProfessor = nomeProfessor;
		this.titulo = titulo;
		this.salario = salario;
	}
	
	// metodos get e set
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
