package negocio;

public class Livro {
    // propriedades da class
    private String titulo = "";
    private Autor objAutor = null;
    private String genero = "";

    // metodos contrutores
    public Livro() {

    }

    public Livro(String titulo, Autor objAutor, String genero) {
        this.titulo = titulo;
        this.objAutor = objAutor;
        this.genero = genero;
    }

    // metodos get/set da class
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getObjAutor() {
        return objAutor;
    }

    public void setObjAutor(Autor objAutor) {
        this.objAutor = objAutor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
