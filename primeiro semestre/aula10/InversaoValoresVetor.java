package aula10;
import java.util.Scanner;

public class InversaoValoresVetor {
    public static void main(String[] args) {
        //var
        Scanner leitor = new Scanner(System.in);
        
        int[] vetorOriginal = new int[10];
        int[] vetorInvertido = new int[10];

        //entrada de dados
        for(int i = 0; i < vetorOriginal.length; i++){
            System.out.print("Digite um número: ");
            vetorOriginal[i] = leitor.nextInt();
        }

        leitor.close();
        
        //processamento
        for(int i = 0; i < vetorInvertido.length ; i++){
            vetorInvertido[vetorOriginal.length - i - 1] = vetorOriginal[i];
        }
        
        //saida de dados
        for(int i = 0 ; i < vetorInvertido.length ; i++){
            System.out.println(i + ":" + vetorInvertido[i]);
        }
    }
}
