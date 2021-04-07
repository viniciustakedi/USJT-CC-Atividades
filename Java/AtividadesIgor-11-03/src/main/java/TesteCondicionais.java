import javax.swing.JOptionPane;

public class TesteCondicionais {
    public static void main(String[] args) {
        // Declaração de variaveis
        double nota, frequencia;

        // Entrada de dados
        nota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota: "));
        frequencia = Double.parseDouble(JOptionPane.showInputDialog("Insira a frequencia: "));

        // Procssamento
        // Estrutura de seleção ou desvio de fluxo
        //If else mais detalhado
        if (nota > 0.0 && nota < 100.0 && frequencia > 0.0 && frequencia < 100.0) {
            //If ternário para verificar as condições
            String resultado = nota >= 50.0 && frequencia >= 85 ? "Aluno foi aprovado!" : "Aluno foi reprovado!";
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Algum valor inserido nao e valido!");
        }

        // If else padrão
        // if (nota >= 50.0 && frequencia >= 85) { //Nota maior ou igual a 50.0 ela
        // entra no bloco
        // JOptionPane.showMessageDialog(null, "O aluno foi aprovado!");
        // }
        // else {
        // JOptionPane.showMessageDialog(null, "O aluno foi reprovado!");
        // }
    }
}
