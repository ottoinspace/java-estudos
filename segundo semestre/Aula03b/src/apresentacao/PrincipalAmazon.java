package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class PrincipalAmazon {
	public static void main(String[] args) {
		// declaracao de variavel 
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
								System.in));
		Compra objCompra = new Compra();
		Produto objProduto = new Produto();
		
		// entrada de dados
		try {
			System.out.print("Digite o nome do produto: ");
			objProduto.setNome(leitor.readLine());
			
			System.out.print("Digite o tipo do produto: ");
			objProduto.setObjTipo(new Tipo(leitor.readLine()));
			
			System.out.print("Digite o preco do produto: ");
			objProduto.setPreco(Double.parseDouble(leitor.readLine()));
			
			
			objCompra.setObjProduto(objProduto);

			System.out.print("Digite a quantidade: ");
			objCompra.setQuantidade(Integer.parseInt(leitor.readLine()));
			
			System.out.print("Digite data da compra: ");
			objCompra.setData(leitor.readLine());
			
			System.out.print("Digite o numero do cartao: ");
			objCompra.setCartao(leitor.readLine());
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		// saida de dados
        System.out.println("");
        System.out.println("------ NOTA FISCAL ------");
        System.out.println("");
        System.out.println("Produto: " + objCompra.getObjProduto().getNome());
        System.out.println("Tipo: " + objCompra.getObjProduto().getObjTipo().getDescricao());
        System.out.println("Preco: " + objCompra.getObjProduto().getPreco());
        System.out.println("Quantidade: " + objCompra.getQuantidade());
        System.out.println("Data: " + objCompra.getData());
        System.out.println("Cartao: " + objCompra.getCartao());
        
	}
}
