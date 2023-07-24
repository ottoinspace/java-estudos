package aula14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculoDigitoCPF {
    public static void main(String[] args) {
        //Declaracao de var
        String cpf = "";

        //entrada de dados
        cpf = lerTextoTamanhoFixo(9);

        //processamento
        cpf = calcularDV(cpf);

        //saida de dados
        System.out.println(cpf);
    }

    static String calcularDV(String cpf){
        int dv1 = 0;
        for(int i = 10; i > 1; i--){
            dv1 += (Integer.parseInt(cpf.substring(10 - i, 11 - i)) * i);
        }
        dv1 = (dv1 % 11);
        if (dv1 <= 10){
            dv1 = 0;
        }

        cpf += dv1;
        
        int dv2 = 0;
        for(int i = 11; i > 1; i--){
            dv2 += (Integer.parseInt(cpf.substring(11 - i, 12 - i)) * i);
        }
        dv2 = (dv1 % 11);
        if (dv2 <= 10){
            dv2 = 0;
        }

        return cpf+dv2;
    }
    
    static String lerTextoTamanhoFixo(int tamanho){
        String retorno = "";
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        do{
            try{
                System.out.print("digite um texto de tamanho " + tamanho + ": ");
                retorno = leitor.readLine();
            }catch(Exception erro){
                System.out.println(erro);
            }
        }while (retorno.length() != tamanho);

        return retorno;
    }
}
