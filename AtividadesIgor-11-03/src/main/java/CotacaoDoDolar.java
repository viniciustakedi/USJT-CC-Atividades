import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CotacaoDoDolar {
    public static void main(String[] args) {
        
        //Declaraçao de variaveis
        double cotacao, qntDolar, account;

        //Coleta de dados, no caso a cotação e a quantidade de dolares
        cotacao = Double.parseDouble(JOptionPane.showInputDialog("Insira a cotacao do Dolar: "));
        qntDolar = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de Dolar: "));

        //conta para a conversao
        account = cotacao * qntDolar;

        //Formatador de decimais, para deixar somente com 2 casa após a virgula
        DecimalFormat formater = new DecimalFormat("###,##0.00");

        //Mensagem para mostrar resultado
        JOptionPane.showMessageDialog(null, "$"+ qntDolar +" eh igual a R$"+ formater.format(account));
    }
}
