import javax.swing.JOptionPane;

public class OrdemCrescente {
    public static void main(String[] args) {
        //Declaraçao de variaveis
        int num1, num2, num3;

        //Coleta de dados
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro valor"));

        // Verifica se o num1 é maior que num2
        if (num1 > num2) { //Se for verdadeiro ele entra
            //Verifica se num 1 é maior que num 3
            if (num1 > num3) { //Se for verdadeiro ele entra
                //Verifica se num 2 é maior que num3
                if (num2 > num3) { //Se for verdadeiro ele entra
                    //Caso num1 for maior que num 2, num1 for maior que num3 e num2 for maior que num3
                    JOptionPane.showMessageDialog(null, num3 +" - "+  num2 +" - "+ num1);
                } 
                else {
                    //Caso num1 for maior que num 2, num1 for maior que num3 e num3 for maior que num2
                    JOptionPane.showMessageDialog(null, num2 +" - "+ num3 +" - "+ num1);
                }
            }   
            else {
                //Caso num1 for maior que num 2, num3 for maior que num2
                JOptionPane.showMessageDialog(null, num2 +" - "+ num1 +" - "+ num3);
            } 
        } 
        else if (num1 > num3) {
                //Caso num2 for maior que num1 e num1 for maior que num3
                JOptionPane.showMessageDialog(null, num3 +" - "+ num1 +" - "+ num2);
        }   
        else if (num2 > num3){
                //Caso num2 for maior que num1 e num2 for maior que num3
                JOptionPane.showMessageDialog(null, num1 +" - "+ num3 +" - "+ num2);
        } 
        else {
                //Caso num2 for maior que num1, num3 for maior que num1 e num3 for maior que num2
                JOptionPane.showMessageDialog(null, num1 +" - "+ num2 +" - "+ num3);
        }
    }
}