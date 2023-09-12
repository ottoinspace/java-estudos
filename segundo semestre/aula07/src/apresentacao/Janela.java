package apresentacao;

import javax.swing.*;
import java.io.Serial;

public class Janela extends JFrame {
    //propriedade da classe
    @Serial
    private static final long serialVersionUID = 1L;
    Painel objPainel = new Painel();

    //metodo principal de execucao da classe
    public static void main(String[] args) {
        new Janela().setVisible(true);
    }

    //metodo construtor da classe

    public Janela() {
        // configuracao da janela
        setTitle("Minha primeira janela JAVA!");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("iconeCopy.png").getImage());

        // configuracao do painel
        objPainel.setLayout(null);
        setContentPane(objPainel);
    }
}
