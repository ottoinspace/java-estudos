package negocio;

public class Aluno {
	// propriedade da classe
	private int matricula = 0;
	private String nomeAluno = "";
	
	// metodos construtores
	public Aluno() {
		super();
	}
	public Aluno(int matricula, String nomeAluno) {
		super();
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
	}
	
	// metodos get e set
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	
}
