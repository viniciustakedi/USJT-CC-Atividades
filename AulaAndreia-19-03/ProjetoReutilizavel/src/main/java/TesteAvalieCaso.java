import javax.swing.JOptionPane;

public class TesteAvalieCaso {
    public static void main(String[] args) {
        //Declaração de variavel e coleta de dados
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota: "));
        
        if (nota >= 0 && nota <= 10) {
            switch (nota) {
                case 10:
                    JOptionPane.showMessageDialog(null, "Parabens!!");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Tá bom, tirou 9!!");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "8 e 10!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Precisa melhorar!!");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Inseriu uma nota invalida! O correto e de 0 a 10.");
        }

    }
}
