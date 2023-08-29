package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Produto;
import negocio.Estante;

public class PrincipalControleEstoque {
    public static void main(String[] args) {
        // declarar variavel
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Produto objProduto = new Produto();

        // entrada de dados
        try{
            System.out.print("Digite o nome do produto: ");
            objProduto.setNome(leitor.readLine());

            System.out.print("Digite a estante que deseja guarda: ");
            objProduto.setObjEstante(new Estante(Integer.parseInt(leitor.readLine())));

            System.out.print("Digite a quantidade de produto: ");
            objProduto.setQuantidade(Integer.parseInt(leitor.readLine()));

        } catch(Exception erro) {
            System.out.print(erro);
        }

        //saida de dados
        System.out.println("");
        System.out.println("Produto: " + objProduto.getNome());
        System.out.println("Estante: " + objProduto.getObjEstante().getNumero());
        System.out.println("Quantidade: " + objProduto.getQuantidade());
    }
}