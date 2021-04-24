package ExerciciosJava;

public class ExOne {

    public static void main(String[] args) {
        //Declaracao de variaveis
        int a = 3, b = 7, c = 4;

        //Afirmacoes
        //A
        System.out.print("A: ");
        int resultA = a + c;
        if (resultA > b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //B
        System.out.print("B: ");
        int resultB = a + 2;
        if (b >= resultB) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //C
        System.out.print("C: ");
        int resultC = b - a;
        if (c == resultC) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //D
        System.out.print("D: ");
        int resultD = b + a;
        if (resultD <= c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        //E
        System.out.print("E: ");
        int resultE = c + a;
        if (resultE > b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
    }
}

