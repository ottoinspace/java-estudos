package apresentacao;
import javax.swing.*;
import java.io.Serial;


public class Janela extends JFrame{
    //propriedade da classe
    @Serial
    private static final long serialVersionUID = 2L;
    private JPanel objPainel = new JPanel();

    private JMenuBar barraDeMenu = new JMenuBar();
    private JMenu menuArquivo = new JMenu("Arquivo");
    private JMenu menuEditar = new JMenu("Editar");
    private  JMenuItem mniNovo = new JMenuItem("Novo");
    private  JMenuItem mniAbrir= new JMenuItem("Abrir");
    private  JMenuItem mniCopiar = new JMenuItem("Copiar");
    private  JMenuItem mniColar = new JMenuItem("Colar");

    private JButton btnSair = new JButton("Sair");

    private JLabel lblResumo = new JLabel("Resumo");
    private JTextField txtResumo = new JTextField();

    private JLabel lblTexto = new JLabel("Texto");
    private JTextArea txtTexto = new JTextArea();
    private JScrollPane jspTexto = new JScrollPane(txtTexto);

    private JLabel lblOpcoes = new JLabel("Opcoes");
    private JComboBox<String> cboOpcao = new JComboBox<String>();

    private  JCheckBox chkItalico = new JCheckBox("Italico");
    private JCheckBox chkNegrito = new JCheckBox("Negrito");

    private ButtonGroup btgAfirmacao = new ButtonGroup();
    private JRadioButton optSim = new JRadioButton("Sim");
    private JRadioButton optNao = new JRadioButton("Nao");

    private JLabel lblCOmpras = new JLabel("Compras");
    private DefaultListModel<String> mdlCompras = new DefaultListModel<>();
    private JList<String> lstCompras = new JList<>();
    private JScrollPane jspCompras = new JScrollPane(lstCompras);

    // metodo principal da classe
    public static void main(String[] args) { new Janela().setVisible(true); }

    // metodo construtor da classe
    public Janela() {
        // configuracao da janela
        setTitle("Janela de Modelo de Utilizacao de Controles");
        setSize(1024,768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // configuracao do painel
        objPainel.setLayout(null);
        setContentPane(objPainel);

        // configuracao do menu
        setJMenuBar(barraDeMenu);
        barraDeMenu.add(menuArquivo);
        barraDeMenu.add(menuEditar);

        menuArquivo.add(mniNovo);
        menuArquivo.add(mniAbrir);

        menuEditar.add(mniCopiar);
        menuEditar.add(mniColar);

        // configuracao das acoes
        mniNovo.addActionListener(new ControladorNovo());

        // configuracao do botao
        btnSair.setBounds(870, 650, 100, 30);
        objPainel.add(btnSair);
        btnSair.addActionListener(new ControladorSair());

        // configuracao caixa de texto
        lblResumo.setBounds(20, 20, 200, 20);
        objPainel.add(lblResumo);

        txtResumo.setBounds(20,45,500,20);
        objPainel.add(txtResumo);

        // configuracao area texto
        lblTexto.setBounds(20, 80, 200, 20);
        objPainel.add(lblTexto);

        jspTexto.setBounds(20, 105, 950, 200);
        objPainel.add(jspTexto);

        txtTexto.setLineWrap(true);

        // configuracao caixa de opcoes
        lblOpcoes.setBounds(20, 325, 200, 20);
        objPainel.add(lblOpcoes);

        cboOpcao.setBounds(20, 350, 300, 20);
        objPainel.add(cboOpcao);

        cboOpcao.addItem("");
        cboOpcao.addItem("Opcao 1");
        cboOpcao.addItem("Opcao 2");
        cboOpcao.addItem("Opcao 3");
        cboOpcao.addItem("Opcao 4");
        cboOpcao.addItem("Opcao 5");

        // configuracao caixas de marcao
        chkItalico.setBounds(20, 390, 100, 20);
        objPainel.add(chkItalico);

        chkNegrito.setBounds(120, 390, 100, 20);
        objPainel.add(chkNegrito);

        // configuracao dos botoes de opcao
        btgAfirmacao.add(optSim);
        btgAfirmacao.add(optNao);

        optSim.setBounds(20, 420, 100, 20);
        objPainel.add(optSim);

        optNao.setBounds(120, 420, 100, 20);
        objPainel.add(optNao);

        // configruacao lista de compras
        lblCOmpras.setBounds(20, 460, 200, 20);
        objPainel.add(lblCOmpras);

        jspCompras.setBounds(20, 480, 950, 100);
        objPainel.add(jspCompras);

        lstCompras.setModel(mdlCompras);
        mdlCompras.addElement("Iphone");
        mdlCompras.addElement("Camiseta");
        mdlCompras.addElement("Maconha");
        mdlCompras.addElement("Elefante");
        mdlCompras.addElement("Laranjas");
        mdlCompras.addElement("Carros");

    }
}
