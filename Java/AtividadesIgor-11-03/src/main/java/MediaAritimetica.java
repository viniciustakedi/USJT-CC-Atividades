import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MediaAritimetica {
    public static void main(String[] args) {
        
        //Declarações de variáveis
        double nota1, nota2, nota3, media;

        //Mensagem de instrução
        JOptionPane.showMessageDialog(null, "Insira notas de 0 a 10 para a media ser calculada");

        //Coleta de dados, no caso as notas
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota: "));

        //Calculo da média
        media = (nota1 + nota2 + nota3) / 3;

        //Formatador de decimais, para deixar somente com 1 casa após a virgula
        DecimalFormat formater = new DecimalFormat("###,##0.0");
        
        //Mensagem de resultado de média
        JOptionPane.showMessageDialog(null, "Media: " + formater.format(media));
    }
}
