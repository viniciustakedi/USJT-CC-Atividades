import javax.swing.JOptionPane;

public class TesteWhile {
    public static void main(String[] args) {
        //declarar variaveis
        int contador = 1; //controle do laço
        double nota1, nota2;
        
        while (contador <= 5) {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
            JOptionPane.showMessageDialog(null, (nota1 + nota2)/2);
            
            contador = contador + 1;
        }
    }
}
