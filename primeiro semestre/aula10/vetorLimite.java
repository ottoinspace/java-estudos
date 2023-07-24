package aula10;
import java.util.Scanner;

public class vetorLimite {
    public static void main(String[] args) {
        //variavel
        Scanner leitor = new Scanner(System.in);

        int[] vetorOriginal = new int[6];
        int[] vetorLimite = new int[6];

        int limite = 0;
        int qtdElementosVetorLimite = 0;


        //entrada de dados
        for(int i = 0; i < vetorOriginal.length; i++){
            System.out.print("Digite um valor para a posição " + i + ": ");
            vetorOriginal[i] = leitor.nextInt();
        }

        System.out.print("Digite o limite: ");
        limite = leitor.nextInt();

        leitor.close();
        
        //processamento
        for(int i = 0; i < vetorLimite.length; i++){
            if(vetorOriginal[i] >= limite){
                vetorLimite[qtdElementosVetorLimite] = vetorOriginal[i];
                qtdElementosVetorLimite++;
            }
        }

        //saida de dados
        for(int i = 0; i < qtdElementosVetorLimite; i++){
            System.out.println(i + " : " + vetorLimite[i]);
        }
    }
}
