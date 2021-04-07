import java.util.Scanner;

public class MaiorOuMenor {
    public static void main(String[] args) {
        //Pegar dados via console
        Scanner s = new Scanner(System.in);

        //Declaração de variavel e coleta de dados
        int age  = s.nextInt();
        String answer;

        //Verificaçao por if e else normal
        //Segundo a legislação é considerados maiores de idade pessoas que 
        //são maiores ou que possuem 18 anos
        if (age >= 18) {
            answer = "Maior de idade - if/else";
            System.out.println(answer);
        }
        else {
            answer = "Menor de idade - if/else";
            System.out.println(answer);
        }

        //Com operador ternário
        answer = age >= 18 ? "Maior de idade - ternario" : "Menor de idade - ternario";
        System.out.println(answer);


    }
}