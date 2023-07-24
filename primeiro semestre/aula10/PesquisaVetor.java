package aula10;
import java.util.Scanner;

public class PesquisaVetor {
    public static void main(String[] args) {
        //variaveis
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[10];
        
        int valorProcurado = 0;
        int indiceEncontrado = -1;

        //entrada de dados
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o número da posição " + i + " do vetor:");
            vetor[i] = leitor.nextInt();
        }

        System.out.print("Digite um valor a ser pesquisado: ");
        valorProcurado = leitor.nextInt();

        leitor.close();
        
        //processamento
        for(int i = 0; i < vetor.length ; i++){
            if(vetor[i] == valorProcurado){
                indiceEncontrado = i;
            }
        }

        //Saida de dados
        if (indiceEncontrado == -1){
            System.out.println("NÃO encontrado o valor!");
        } else {
            System.out.println("Encontei o valor na posição " + indiceEncontrado);
        }
    }
}
