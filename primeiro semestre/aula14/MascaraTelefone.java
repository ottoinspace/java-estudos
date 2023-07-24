package aula14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MascaraTelefone {
    public static void main(String[] args) {
        //declaracao de variaveis
        String telefone = "";

        //entrada de dados
        telefone = lerTelefone();

        //saida de dados
        System.out.println(telefone);
    }

    static String lerTelefone(){
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        String telefone = "";
        boolean deuCerto = false;

        while(! deuCerto){
            try{
                deuCerto = true;

                System.out.print("digite um numero de telefone: ");
                telefone = leitor.readLine();

                //+
                if(! telefone.substring(0, 1).equals("+")){
                    deuCerto = false;
                }

                //DDI
                Integer.parseInt(telefone.substring(1, 3));

                //(
                if(! telefone.substring(3, 4).equals("(")){
                    deuCerto = false;
                }

                //DDD
                Integer.parseInt(telefone.substring(4, 6));

                //)
                if(! telefone.substring(6, 7).equals(")")){
                    deuCerto = false;
                }

                //prefixo
                Integer.parseInt(telefone.substring(7, 12));

                //-
                if(! telefone.substring(12, 13).equals(")")){
                    deuCerto = false;
                }

                //sufixo
                Integer.parseInt(telefone.substring(13, 17));

            }catch (Exception erro) {
                System.out.println("Vagabundah");
                deuCerto = false;
            }
        }

        return telefone;
    }
}
