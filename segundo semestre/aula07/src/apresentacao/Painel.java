package apresentacao;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;


public class Painel extends JPanel {
    //propriedade da classe
    @Serial
    private static final long serialVersionUID = 1L;

    // metodos sobrecritos da classe
    public void paintComponent(Graphics g) {
        // ceu
        g.setColor(Color.cyan);
        g.fillRect(0,0,800,300);

        // terra
        g.setColor(Color.green);
        g.fillRect(0,300,800,300);

        // casa
        g.setColor(Color.RED);
        g.fillRect(50,250,150,200);

        // telhado
        g.drawLine(50,250,125,150);
        g.drawLine(125,150,200,250);

        // telhado lateral
        g.drawLine(125, 150, 175, 100);
        g.drawLine(175, 100, 250, 200);

        // lateral da casa
        g.drawLine(200, 450, 250, 400);
        g.drawLine(200, 250, 250, 200);
        g.drawLine(250, 400, 250, 200);

        // sol
        g.setColor(Color.orange);
        g.fillOval(600,50,150,150);

        g.setColor(Color.yellow);
        g.fillOval(625,75,100,100);

        // boneco
        g.setColor(Color.black);
        g.fillOval(600, 275, 70, 70); //cabeca
        g.drawLine(635, 300, 635, 470); // corpo
        g.drawLine(575, 370, 695, 370); // bracos
        g.drawLine(635, 470, 600, 530); // perna esquerda
        g.drawLine(635, 470, 670, 530); // perna direita
    }
}
