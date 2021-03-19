import javax.swing.JOptionPane;

public class VotoObrigatorio {
    public static void main(String[] args) {
        //Declaração de variavel
        int age;
        String information;

        //Coleta de dados
        age = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: "));

        //If ternário para a verificaçao se é obrigado ou não a votar
        //Regra: pela idade, são obrigados a votar maiores de 18 e menores de 70.
        //Como > 18 e < 70
        information = age > 18 && age < 70 ? "Obrigado a votar!" : "Nao e obrigado a votar!";
        //Mensagem de retorno
        JOptionPane.showMessageDialog(null, information);
    }
}