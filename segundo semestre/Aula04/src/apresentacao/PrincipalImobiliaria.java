package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class PrincipalImobiliaria {
	public static void main(String[] args) {
		// declaracao de variavel 
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Imovel objImovel = null;
		int opcao = 0;
		
		// entrada de dados
		try {
			System.out.print("Digite <1> se for novo e <2> usado: ");
			opcao = Integer.parseInt(leitor.readLine());
			
			if (opcao == 1) {
				objImovel = new Novo();
			} else if (opcao == 2) {
				objImovel = new Usado();
			}
			
			System.out.println("Digite o endereco: ");
			objImovel.setEndereco(leitor.readLine());
			
			System.out.println("Digite a metragem: ");
			objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
			
			System.out.println("Digite o valor original: ");
			objImovel.setValor(Double.parseDouble(leitor.readLine()));
			
			if (opcao == 1) {
				System.out.println("Digite o percentual adicional do imovel <0 ~ 1>: ");
				((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine()));
			} else if (opcao == 2) {
				System.out.println("Digite o percentual depreciado do imovel <0 ~ 1>: ");
				((Usado) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine()));
			}
			
		}catch (Exception error) {
			System.out.println(error);
		}
		
		// saida de dados
		System.out.println("");
		System.out.println("-----NOTA FISCAL-----");
		System.out.println("Endereco: " + objImovel.getEndereco());
		System.out.println("Metragem: " + objImovel.getMetragem());
		System.out.println("Valor: R$" + objImovel.getValor());
	}
}
