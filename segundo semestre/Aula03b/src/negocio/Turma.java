package negocio;

public class Turma {
	// propriedades da classe
	private Cardeira objCadeira = null;
	private Professor objProfessor = null;
	private char letra = 'a';
	private Aluno[] colecao = new Aluno[50];
	
	// metodo construtores
	public Turma() {
		super();
	}
	public Turma(Cardeira objCadeira, Professor objProfessor, char letra, Aluno[] colecao) {
		super();
		this.objCadeira = objCadeira;
		this.objProfessor = objProfessor;
		this.letra = letra;
		this.colecao = colecao;
	}
	
	// metodo get/set
	public Cardeira getObjCadeira() {
		return objCadeira;
	}
	public void setObjCadeira(Cardeira objCadeira) {
		this.objCadeira = objCadeira;
	}
	public Professor getObjProfessor() {
		return objProfessor;
	}
	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	public Aluno[] getColecao() {
		return colecao;
	}
	public void setColecao(Aluno[] colecao) {
		this.colecao = colecao;
	}
	
	// metodos da classe
	private int qtdAlunos = 0;
	
	public void adicionarAluno(Aluno objAluno) {
		colecao[qtdAlunos] = objAluno;
		qtdAlunos++;
	}
	
	public void listarAlunos() {
		System.out.println("Alunos matriculados: ");
		for (int i = 0 ; i < qtdAlunos ; i++) {
			System.out.println(colecao[i].getMatricula() + 
						"\t" + colecao[i].getNomeAluno());
		}
	}
	
}
