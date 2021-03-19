import javax.swing.JOptionPane;

public class OperacoesAritimeticas {
    public static void main(String[] args) {
        //Declaracao de variaveis int
        int num1, num2, sum, less, multi, divis, rest;

        //lendo os numeros input
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro segundo: "));

        //operacoes
        sum = num1 + num2;
        less = num1 - num2;
        multi = num1 * num2;
        divis = num1 / num2;
        rest = num1 % num2;

        //soma
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " +sum);
        System.out.println(num1 + " + " + num2 + " = " +sum);
        //subtracao
        JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " +less);
        System.out.println(num1 + " - " + num2 + " = " +less);
        //multiplicacao
        JOptionPane.showMessageDialog(null, num1 + " x " + num2 + " = " +multi);
        System.out.println(num1 + " x " + num2 + " = " +multi);
        //divisao
        JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " +divis);
        System.out.println(num1 + " / " + num2 + " = " +divis);
        //Resto
        JOptionPane.showMessageDialog(null, num1 + " % " + num2 + " = " +rest);
        System.out.println(num1 + " % " + num2 + " = " +rest);

        


    }
}