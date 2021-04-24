package ExerciciosJava;

public class ExTwo {
    
    public static void main(String[] args) {
        //declaracao de variaveis
        int a = 5, b =4, c = 3, d = 6;
        
        //A
        System.out.print("A: ");
        if (a > c && c <= d) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        //B
        System.out.print("B: ");
        if ((a+b) > 10 || (a+b) == (c+d)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        //C
        System.out.print("C: ");
        if (a >= c && d >= c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        
    }
}
