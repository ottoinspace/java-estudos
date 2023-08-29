package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Carro;
import negocio.Fabricante;
import negocio.Moto;
import negocio.Veiculo;

public class PrincipalConcessionaria {
	public static void main(String[] args) {	
		// var
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Veiculo objVeiculo = null;
		int opcao = 0;
		
		// entrada de dados
		try {
			System.out.println("Digite <1>para carro ou <2> para moto: ");
			opcao = Integer.parseInt(leitor.readLine());
			
			if(opcao == 1) {
				objVeiculo = new Carro();
			}else if(opcao == 2) {
				objVeiculo = new Moto();
			}else {
				System.out.println("Opcao invalida");
			}
			
			System.out.println("Digite o modelo: ");
			objVeiculo.setModelo(leitor.readLine());
			
			System.out.println("Digite o fabricante: ");
			objVeiculo.setObjFabricante(new Fabricante(leitor.readLine()));
			
			System.out.println("Digite a cor: ");
			objVeiculo.setCor(leitor.readLine());
			
			if(opcao == 1) {
				System.out.println("Digite <S> para teto solar: ");
				((Carro) objVeiculo).setTetoSolar(leitor.readLine().equalsIgnoreCase("S"));
			}else {
				System.out.println("Digite a cilindrada: ");
				((Moto) objVeiculo).setCilindrada(Integer.parseInt(leitor.readLine()));
			}
		}catch (Exception error) {
			System.out.print(error);
		}
		
		// saida de dados
		System.out.println("Fabricante: " + objVeiculo.getObjFabricante().getNome());
		System.out.println("Modelo: " + objVeiculo.getModelo());
		System.out.println("Cor: " + objVeiculo.getCor());
		if(opcao == 1) {
			System.out.println("Teto solar: " + (((Carro) objVeiculo).getTetoSolar() ? "SIM" : "NAO"));
		} else {
			System.out.println("Cilindrada: " + ((Moto) objVeiculo).getCilindrada());
		}
	}
}
