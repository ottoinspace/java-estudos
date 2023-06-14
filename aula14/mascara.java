package aula14;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mascara {
    //funcao que le o numero inteiro
    static int lerNumero(){
        int retorno = 0;
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        boolean deuCerto = false;

        do{
            try{
                System.out.print("Digite um numero inteiro");
                retorno = Integer.parseInt(leitor.readLine());
                deuCerto = true;
            }catch (Exception erro){
                System.out.println("Vagabundo! Nao esta dificil... digita ai...");
                deuCerto = false;
            }
        }while(! deuCerto);

        return retorno;
    }
    public static void main(String[] args) {
        int numero = lerNumero();

        System.out.print(numero);
    }
}
