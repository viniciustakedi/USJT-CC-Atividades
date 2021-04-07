import java.util.Scanner;

public class NotaDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 

        double num1, num2, media;
        //Com do while
        int contador = 1;
        do {
            num1 = s.nextDouble();
            num2 = s.nextDouble();

            media = (num1 + num2) / 2;

            System.out.println("Media: " +media);
            
            contador++;

        } while (contador <= 5);
        
        //Com for
        for (int i = 1 ; i <= 5 ; i++) {
            num1 = s.nextDouble();
            num2 = s.nextDouble();
            
            media = (num1 + num2) / 2;
            
            System.out.println("Media: " +media);
        }
    }
}