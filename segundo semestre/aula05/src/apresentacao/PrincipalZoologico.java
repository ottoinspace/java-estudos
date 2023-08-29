package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aguia;
import negocio.Animal;
import negocio.Ave;
import negocio.Cachorro;
import negocio.Leopardo;
import negocio.Mamifero;

public class PrincipalZoologico {
	public static void main(String[] args) {
		//var
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Animal objAnimal = null;
		
		String opcao = "";
		
		// entrada de dados
		try {
			System.out.println("Selecione o animal: <C>Cachorro"
					+ " <L>Leopardo "
					+ "<A>Aguia: ");
			opcao = leitor.readLine();
			if(opcao.equalsIgnoreCase("C")) {
				objAnimal = new Cachorro();
			} else if(opcao.equalsIgnoreCase("L")) {
				objAnimal = new Leopardo();
			} else if(opcao.equalsIgnoreCase("A")) {
				objAnimal = new Aguia();
			}else {
				System.out.println("Opcao invalida");
			}
			
			System.out.println("Digite o peso: ");
			objAnimal.setPeso(Double.parseDouble(leitor.readLine()));
			
			System.out.println("Digite o altura: ");
			objAnimal.setAltura(Double.parseDouble(leitor.readLine()));
			
			System.out.println("Digite o nome do animal: ");
			objAnimal.setNome(leitor.readLine());
			
			if(opcao.equalsIgnoreCase("C") || opcao.equalsIgnoreCase("L")) {
				System.out.println("Digite a quantidade de litros de leite: ");
				((Mamifero) objAnimal).setLitrosLeite(Double.parseDouble(leitor.readLine()));
				if(opcao.equalsIgnoreCase("C")) {
					System.out.println("Digite a forca da mordida: ");
					((Cachorro) objAnimal).setForcaMordida(Double.parseDouble(leitor.readLine()));
				}else if(opcao.equalsIgnoreCase("L")) {
					System.out.println("Digite a velocidade: ");
					((Leopardo) objAnimal).setVelocidade(Double.parseDouble(leitor.readLine()));
				}
			}else if(opcao.equalsIgnoreCase("A")){
				System.out.println("Digite a quantidade de ovos: ");
				((Ave) objAnimal).setQuantidadeOvos(Integer.parseInt(leitor.readLine()));
				System.out.println("Digite a autonomia da aguia: ");
				((Aguia) objAnimal).setAutonomia(Double.parseDouble(leitor.readLine()));
			}
		}catch(Exception error) {
			System.out.println(error);
		}
		
		// saida de dados
		System.out.println("Peso: " + objAnimal.getPeso());
		System.out.println("Altura: " + objAnimal.getAltura());
		double peso = objAnimal.getPeso();
		double altura = objAnimal.getAltura();
		System.out.println("IMC: " + objAnimal.calcularImc(peso, altura));
		System.out.println("Nome: " + objAnimal.getNome());
		if(opcao.equalsIgnoreCase("C") || opcao.equalsIgnoreCase("L")) {
			System.out.println("Litros de leite: " + ((Mamifero) objAnimal).getLitrosLeite());
			if(opcao.equalsIgnoreCase("C")) {
				System.out.println("Mordida: " + ((Cachorro) objAnimal).getForcaMordida());
				((Cachorro) objAnimal).morde();
			} else if (opcao.equalsIgnoreCase("L")) {
				System.out.println("Velocidade: " + ((Leopardo) objAnimal).getVelocidade());
				((Leopardo) objAnimal).correr();
			}
		} else if(opcao.equalsIgnoreCase("A")) {
			System.out.println("Quantidade de ovos: " + ((Ave) objAnimal).getQuantidadeOvos());
			System.out.println("Autonomia: " + ((Aguia) objAnimal).getAutonomia());
			((Aguia) objAnimal).voar();
		}
	}
}
