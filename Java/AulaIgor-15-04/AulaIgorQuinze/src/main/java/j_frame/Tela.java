package j_frame;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

    public static void main(String[] args) {

        //Criando objto JFrame, que representa uma janela;
        JFrame tela = new JFrame();

        //Altera a visibilidade da janela para True;
        tela.setVisible(true);

        //Alterando o tamanho da janelo (width, height);
        tela.setSize(450, 350);

        //Alterando o comportamento do botao X da janela (Botao de fechar);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Alterando o titulo da janela;
        tela.setTitle("Conversor de temperatura");

        //Centralizando a janela na tela do usuario;
        tela.setLocationRelativeTo(null);

        //Maximizar a janela;
        //MAXIMIZED_VERT;
        //MAXIMIZED_HORIZ;
        //tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //Criar um container para manipular o content pane da janela;
        Container painelDeConteudo = tela.getContentPane();

        //definindo um gerenciador de layout;
        painelDeConteudo.setLayout(new GridLayout(2, 2, 4, 4));

        //Criando objeto do tipo JTextField;
        JTextField tempCelsius = new JTextField(10);

        //Criando um rotulo para o C;
        JLabel celsiusLabel = new JLabel("°C");

        //Criando um botao;
        JButton converterButton = new JButton("Converter");

        //Criando um rotulo
        JLabel valorConvertidoLabel = new JLabel();

        //Adicionar a caixa de texto ao painel (container);
        painelDeConteudo.add(tempCelsius);
        //Adicionando o rotulo ao painel
        painelDeConteudo.add(celsiusLabel);
        //Adicionando o botao ao painel;
        painelDeConteudo.add(converterButton);
        //Adicionando o rotulo valorConvertidoLabel ao painel;
        painelDeConteudo.add(valorConvertidoLabel);

        //Redimensiona a janela para caber os componentes;
        tela.pack();

        converterButton.addActionListener(
                (e) -> {
                    //1 passo
                    double celsius = Double.parseDouble(tempCelsius.getText());
                    
                    //2 passo
                    double resultado = celsius / 5 * 9 + 32;
                    
                    //3 passo
                    valorConvertidoLabel.setText(String.format("%.2f" + " °F",resultado));
                    
                    //Limpar caixa de texto
                    tempCelsius.setText("");
                    
                    // sempre voltar para caixa de texto atribuir a atencao;
                    tempCelsius.grabFocus();
                }
        );

    }
}
