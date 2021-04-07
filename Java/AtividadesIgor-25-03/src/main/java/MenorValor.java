import javax.swing.JOptionPane;

public class MenorValor {
    public static void main(String[] args) {
        //Declarações de variaveis
        int num1, num2, num3;

        //Coleta de dados
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro valor"));

        if (num1 < num2 && num1 < num3) {
            JOptionPane.showMessageDialog(null, num1);
        } 
        else if (num2 < num1 && num2 < num3) {
            JOptionPane.showMessageDialog(null, num2);
        }
        else if (num3 < num1 && num3 < num2) {
            JOptionPane.showMessageDialog(null, num3);
        }
        else {
            JOptionPane.showMessageDialog(null, "Todos os numeros sao iguais.");
        }
    }
}