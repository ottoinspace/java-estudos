package aula10;
import java.util.Scanner;

public class matrizes{
    public static void main(String[] args) {
        //var
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[10];

        //entrada de dados
        //matrizes exigem um for
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = leitor.nextInt();
        }

        leitor.close();
        //saida de dados
        for (int i = 0; i < vetor.length; i++){
            System.out.println("indice: " + i + ", valor: " + vetor[i]);
        }
    }
}