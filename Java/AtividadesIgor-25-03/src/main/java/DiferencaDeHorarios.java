import java.util.Scanner;

public class DiferencaDeHorarios {
    public static void main(String[] args) {
        //Declaração de variaveis
        int hour1, minute1, seg1, transformSeg1;
        int hour2, minute2, seg2, transformSeg2;
        int accountDiference;

        //Coletar dados via console
        Scanner s = new Scanner(System.in);

        //Coleta de dados
        hour1 = s.nextInt();
        minute1 = s.nextInt();
        seg1 = s.nextInt();
        //Parte 2
        hour2 = s.nextInt();
        minute2 = s.nextInt();
        seg2 = s.nextInt();

        //Transformando tudo em segundos
        transformSeg1 = ((hour1 * 3600) + minute1 * 60) + seg1;
        transformSeg2 = ((hour2 * 3600) + minute2 * 60) + seg2;

        //Calculando diferenca de horarios por segundo
        if (transformSeg1 > transformSeg2) {
            accountDiference = transformSeg1 - transformSeg2;
            System.out.println(accountDiference);
        }
        else {
            accountDiference = transformSeg2 - transformSeg1;
            System.out.println(accountDiference);
        }

        //Executar via console (Windowns) - Java nomedoarquivo.java
        //Executar via console (Linux: Não tenho certeza se é assim) - java -jar nomedoarquivo.jar
    }
}