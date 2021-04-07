import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        //Entrada de dados via console
        Scanner s = new Scanner(System.in);

        //Declaração de variaveis e coleta de dados
        System.out.println("Insira um numero: ");
        int number = s.nextInt();

        if (number < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("POSITIVO");
        }

        //Executar via console (Windowns) - Java nomedaclasse.java


    }
}