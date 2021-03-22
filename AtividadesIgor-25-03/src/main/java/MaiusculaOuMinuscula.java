import javax.swing.JOptionPane;

public class MaiusculaOuMinuscula {
    public static void main(String[] args) {
        //Declaração de variavel e Coleta de dados
        String caractere = JOptionPane.showInputDialog("Insira o caractere: ");

        if (caractere.length() == 1) {
            if (caractere.matches("^[a-z]")) {
                JOptionPane.showMessageDialog(null, caractere+" = Minuscula");
            }
            else {
                JOptionPane.showMessageDialog(null, caractere+" = Maiuscula");
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Erro! Foi inserido mais de um caractere!");
        }
    }
}