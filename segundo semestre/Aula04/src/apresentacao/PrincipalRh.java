package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Colaborador;
import negocio.Gerente;

public class PrincipalRh {
	public static void main(String[] args) {
		// declaracao de varivel
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Colaborador objColaborador = null;
		int opcao = 0;
		
		// entrada de dados
		try {
			System.out.print("Digite <1> para colaborador " +
							 "ou <2> para gerente: ");
			opcao = Integer.parseInt(leitor.readLine());
			
			if (opcao == 1) {
				objColaborador = new Colaborador();
			} else if (opcao == 2){
				objColaborador = new Gerente();
			} else {
				System.out.println("Opcao invalida");
			}
			
			System.out.print("Digite a matricula: ");
			objColaborador.setMatricula(Integer.parseInt(leitor.readLine()));
			
			System.out.print("Digite o nome: ");
			objColaborador.setNome(leitor.readLine());
			
			System.out.print("Digite o salario bruto: ");
			objColaborador.setSalario(Double.parseDouble(leitor.readLine()));
			
			if (opcao == 2) {
				System.out.print("Digite o bonus: ");
				/* cast */ ((Gerente) objColaborador).setBonus(Double.parseDouble(leitor.readLine())); 
			}
		}catch (Exception erro) {
			System.out.println(erro);
		}
		
		// saida de dados
		System.out.println("");
		System.out.println("Matricula: " + objColaborador.getMatricula());
		System.out.println("Nome: " + objColaborador.getNome());
		System.out.println("Salario: R$" + objColaborador.getSalario());
	}
}
