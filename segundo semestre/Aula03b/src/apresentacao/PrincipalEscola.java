package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aluno;
import negocio.Cardeira;
import negocio.Professor;
import negocio.Turma;

public class PrincipalEscola {
	public static void main(String[] args) {
		// declaracao de variaveis
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
								System.in));
		Turma objTurma = new Turma();
		Professor objProfessor = new Professor();
		Aluno objAluno = new Aluno();
		
		// entrada de dados
		try {
			System.out.print("Digite a cadeira: ");
			objTurma.setObjCadeira(new Cardeira(leitor.readLine()));
			
			System.out.print("Digite o nome do professor: ");
			objProfessor.setNomeProfessor(leitor.readLine());
			
			System.out.print("Digite o titulo do professor: ");
			objProfessor.setTitulo(leitor.readLine());
			
			objTurma.setObjProfessor(objProfessor);
			
			do {
				objAluno = new Aluno();
				
				System.out.print("Digite o nome do aluno: ");
				objAluno.setNomeAluno(leitor.readLine());
				
				System.out.print("Digite a matricula do aluno: ");
				objAluno.setMatricula(Integer.parseInt(leitor.readLine()));
				
				objTurma.adicionarAluno(objAluno);
				
				System.out.print("Digite <S> para mais alunos: ");
			}while (leitor.readLine().equalsIgnoreCase("S"));
			
		}catch (Exception erro) {
			System.out.print(erro);
		}
		
		// saida de dados
		System.out.println("");
		System.out.println("Cadeira: " +
							objTurma.getObjCadeira().getNome());
		System.out.println("Professor: " +
				objTurma.getObjProfessor().getNomeProfessor());
		objTurma.listarAlunos();
	}
}
