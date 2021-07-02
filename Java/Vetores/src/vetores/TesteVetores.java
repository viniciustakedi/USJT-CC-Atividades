package vetores;

import javax.swing.JOptionPane;

public class TesteVetores {

    public static void main(String[] args) {

        //Criando vetor com 10 elementos
        int[] valores = new int[10];

        //Inicializando o vetor com entrada do usuario;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro: "));

        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);

        }

    }
}
