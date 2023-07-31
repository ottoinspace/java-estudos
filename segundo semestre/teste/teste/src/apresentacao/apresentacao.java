package apresentacao;

import negocio.Pessoa;

public class apresentacao {
    public static void main(String[] args) {
        /*
        Sintaxe para estanciar objetos:
            <classe> <objeto> = new <construtor>();  
         */
        Pessoa objeto = new Pessoa();
        objeto.setNome("Otto");
        objeto.setEndereco("SHIS Qi 14");
        objeto.setTelefone("287-980XX");

        System.out.println("Nome: " + objeto.getNome());
        System.out.println("Endereco: " + objeto.getEndereco());
        System.out.println("Telefone: " + objeto.getTelefone());
        
        System.out.println("");
        
        Pessoa obj2 = new Pessoa("Fulano", "Asa Norte", "000");
        
        System.out.println("Nome: " + obj2.getNome());
        System.out.println("Endereco: " + obj2.getEndereco());
        System.out.println("Telefone: " + obj2.getTelefone());
    }
}
