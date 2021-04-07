import javax.swing.JOptionPane;

public class Antecessor {
    public static void main(String[] args) {

        //Declaração de variavel
        int num, account;

        //Coleta de dados, no caso o número
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro: "));

        //Conta para mostrar o seu antecessor
        account = num - 1;

        //Mensagem para retornar o resultado
        JOptionPane.showMessageDialog(null, "O numero inserido foi "+ num +" e o seu antecessor eh o"+ account);
    }
}
