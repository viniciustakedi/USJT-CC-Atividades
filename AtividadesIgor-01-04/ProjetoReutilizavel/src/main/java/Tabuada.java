import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        //Coleta do input via console
        Scanner s = new Scanner(System.in);

        //Declaracoes de variaveis e coleta de dados
        int conta;
        int num = s.nextInt();
        
        //If para verificar as regras propostas no exercicio
        if (num >= 1 && num <= 20) {
            for (int i = 1; i <= 10; i++) {
                conta = num * i;
                String resposta = num +" x "+ i +" = "+ conta;
                System.out.println(resposta);
            }
        } else {
            System.out.println("Insira um numero entre 1 e 20.");
        }
    }
}