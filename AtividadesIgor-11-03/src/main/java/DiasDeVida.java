import javax.swing.JOptionPane;

public class DiasDeVida {
    public static void main(String[] args) {

        //Declaração de variáveis
        int idade, account;

        //Coleta de dados, no caso a idade em anos;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade em anos: "));

        //Conta para ver a idade de uma pessoa em dias
        account = idade * 365;

        //Mensagem para exibir o resultado
        JOptionPane.showMessageDialog(null, "Sua idade: "+ account +" dias");
    }
}
