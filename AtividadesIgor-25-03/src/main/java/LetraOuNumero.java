import javax.swing.JOptionPane;

public class LetraOuNumero {
    public static void main(String[] args) {
        //Declaraçao de variavel
        String caractere;

        //Coleta de dados
        caractere = JOptionPane.showInputDialog("Insira um caractere: ");

        //Verificacao para ver se o usuario inseriu mais de um caractere
        if (caractere.length() == 1) {
            if (caractere.matches("^[0-9]")) { //método matches faz a verificação se é um numero
                JOptionPane.showMessageDialog(null, "NUMERO");
            }
            else {
                JOptionPane.showMessageDialog(null, "LETRA");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Erro! Voce inseriu mais de um caractere!");
        }
    }
}