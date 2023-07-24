package aula11;
import java.util.Scanner;

public class QuadradoMagico {
    //constantes de classes
    private static final int TAMANHO = 3;
    public static void main(String[] args) {
        //var
        Scanner leitor = new Scanner(System.in);

        int[][] quadrado = new int[TAMANHO][TAMANHO];
        
        int soma = 0;
        int temp = 0;

        boolean ehQuadrado = false;

        // entrada de dados
        for(int i = 0; i < quadrado.length; i++){
            for (int j = 0 ; j < quadrado[i].length; j++){
                System.out.print("Quadrado[" + i + ", " + j + "]: ");
                quadrado[i][j] = leitor.nextInt();
            }
        }

        leitor.close();

        //processamento diagonal principal
        for(int i = 0 ; i < quadrado.length; i++){
            soma+=quadrado[i][i];
        }

        ehQuadrado = true;

        //processamento diagonal invertida
        temp = 0;
        for(int i = 0; i < quadrado.length; i++){
            temp+= quadrado[i][quadrado.length - i - 1];
        }

        if (temp != soma){
            ehQuadrado = false;
        }

        //processamento das linhas
        for (int i = 0; i < quadrado.length ; i++){
            temp = 0;
            for(int j = 0; j < quadrado[i].length ; j++){
                temp += quadrado[i][j];
            }
            if (temp != soma){
                ehQuadrado = false;
            }
        }

        //processamento das colunas
        for (int i = 0; i < quadrado.length ; i++){
            temp = 0;
            for(int j = 0; j < quadrado[i].length ; j++){
                temp += quadrado[j][i];
            }
            if (temp != soma){
                ehQuadrado = false;
            }
        }

        //saida de dados
        if (ehQuadrado){
            System.out.println("Parabens!! e um quadrado magico!!");
        }else{
            System.out.println("NAO, PORRA! Isso nao serve para nada");
        }
    }
}
