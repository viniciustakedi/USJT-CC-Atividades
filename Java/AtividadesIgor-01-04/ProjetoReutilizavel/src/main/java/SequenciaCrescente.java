import java.util.Scanner;

public class SequenciaCrescente {
    public static void main(String[] args) {
        //Pegar input no console
        Scanner s = new Scanner(System.in);

        //Coleta de dados
        String num = s.next();
        boolean result = true;

        //A magica!!
        for (int i = 0; i < num.length()-1; i++) {
            char c = num.charAt(i); 
            int n = Character.getNumericValue(c);
            int ant = 0;
            
            if (result == true) {
                if (n >= ant  || n == 0) {
                    // System.out.println("anterior: "+ ant);                   
                    // System.out.println("atual: "+ n);                   
                    // System.out.println("Deu positivo");
                    ant = Character.getNumericValue(c);
                    System.out.println(ant);
                }
                else {
                    result = false;
                    System.out.println("Deu falso");
                }
            }
        } 

        int countNum = num.length()-1;
        if (result == true) {
            System.out.println(num+" SIM " + countNum);
        } else {
            System.out.println(num+" NAO " + countNum);
        }

    }
}