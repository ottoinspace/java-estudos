package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Livro;
import negocio.Autor;

public class principalLivraria {
    public static void main(String[] args) {
        // declaracao de variaveis
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Livro objLivro = new Livro();
        
        // entrada de dados
        try{
            System.out.print("Digite o titulo do livro: ");
            objLivro.setTitulo(leitor.readLine());

            System.out.print("Digite o autor do livro: ");
            objLivro.setObjAutor(new Autor(leitor.readLine()));

            System.out.print("Digite o genero do livro: ");
            objLivro.setGenero(leitor.readLine());

        } catch(Exception erro) {
            System.out.println(erro);
        }

        // saida de dados
        System.out.println("Titulo: " + objLivro.getTitulo());
        System.out.println("Autor: " + objLivro.getObjAutor().getNome());
        System.out.println("Genero: " + objLivro.getGenero());
    }
}
