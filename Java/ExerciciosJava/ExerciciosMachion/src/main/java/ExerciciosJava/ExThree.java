package ExerciciosJava;

import java.util.Scanner;

public class ExThree {
    
    public static void main(String[] args) {
        //para o scanner funcionar
        Scanner s = new Scanner(System.in);
        
        //declaracao de variavel e coleta do input
        double num = s.nextDouble();
        
        //verificacao para ver se o numero e par
        if ((num % 2) == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        
    }
    
}
