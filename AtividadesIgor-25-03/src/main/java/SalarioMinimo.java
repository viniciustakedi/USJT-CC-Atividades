import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        //Pegar dados via console
        Scanner s = new Scanner(System.in);

        //Declaração de variaveis
        int salarioMinimo = 1100;
        int salario = s.nextInt();

        //Verificação
        if (salario < salarioMinimo) {
            System.out.println("Esta ganhando menos que um salario minimo");
        }
        else if (salario == salarioMinimo) {
            System.out.println("Esta ganhando um salario minimo");
        }
        else {
            System.out.println("Esta ganhando mais que um salario minimo");
        }
    }
}