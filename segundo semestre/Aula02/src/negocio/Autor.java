package negocio;

public class Autor {
    // propriedades da classe
    private String nome = "";

    // metodos construtores
    public Autor() {

    }

    public Autor(String nome) {
        this.nome = nome;
    }
    
    // metodos set/get da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
