package ExerciciosJava;

import java.util.Scanner;

public class ExFour {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        //declaracao de variaveis e coleta de dado
        char sexo = s.next().charAt(0);
        double h = s.nextDouble();
        
        //declaracao de variaveis e conta
        double masculino = (72.7 * h) - 58;
        double feminino = (62.1 * h) - 44.7;
        
        if (sexo == 'm') {
            System.out.println(masculino);
        } else if (sexo == 'f') {
            System.out.println(feminino);
        } else {
            System.out.println("Sexo " + sexo + " invalido");
        }
    }
    
}
