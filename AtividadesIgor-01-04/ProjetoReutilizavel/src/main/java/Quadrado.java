import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        //Scanner para input via console
        Scanner s = new Scanner(System.in);

        //Declaração de variavel e coleta de dados
        int lados = s.nextInt();

        //If para respeitar as regras propostas no exercicio
        if (lados >= 1 && lados <= 20) {
            //For para a repetição das linhas 
            for (int i = 0; i < lados; i++) {
                String caractere = "*";
                System.out.println(caractere.repeat(lados));
            }
        } else {
            System.out.println("So aceitamos numeros entre 1 e 20.");
        }
    }
}