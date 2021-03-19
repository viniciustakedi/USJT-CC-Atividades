import javax.swing.JOptionPane;

public class ParOuImpar{
    public static void main(String[] args) {
        //Declaração de variaveis
        int num, account;

        //Coleta de dados
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro: "));

        //Conta de verificacao
        account = num % 2;

        //Condicionais de verificacao
        if (account == 0) { //Se o resultado da conta for 0 ele é um número par
            JOptionPane.showMessageDialog(null, num+" = PAR");
        } 
        else { //Se o resultado da conta for 1 ele é um número impar
            JOptionPane.showMessageDialog(null, num+" = IMPAR");
        }
    }
}