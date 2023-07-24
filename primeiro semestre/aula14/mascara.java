package aula14;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mascara {
    //funcao que le o numero inteiro
    static int lerNumeroInteiro(){
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

    static double lerNumeroFracionario(){
        double retorno = 0;
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        boolean deuCerto = false;

        do{
            try{
                System.out.print("Digite um numero fracionario");
                retorno = Double.parseDouble(leitor.readLine());
                deuCerto = true;
            }catch (Exception erro){
                System.out.println("Vagabundo! Nao esta dificil... digita ai...");
                deuCerto = false;
            }
        }while(! deuCerto);

        return retorno;
    }

    static String lerTextoTamanhoFixo(int tamanho){
        String retorno = "";
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        do{
            try{
                System.out.print("digite um texto de tamanho" + tamanho + ": ");
                retorno = leitor.readLine();
            }catch(Exception erro){
                System.out.println(erro);
            }
        }while (retorno.length() != tamanho);

        return retorno;
    }

    public static void main(String[] args) {
        int numero = lerNumeroInteiro();
        double fracao = lerNumeroFracionario();
        String texto5 = lerTextoTamanhoFixo(5);
        String texto8 = lerTextoTamanhoFixo(8);

        System.out.print(numero);
        System.out.println(fracao);
        System.out.println(texto5);
        System.out.println(texto8);
    }
}
