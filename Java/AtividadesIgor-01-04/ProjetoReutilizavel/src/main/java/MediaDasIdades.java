import java.util.Scanner;

public class MediaDasIdades {
    public static void main(String[] args) {
        //Para usar console
        Scanner s = new Scanner(System.in);

        //Declaracão de variavel
        String idade;
        int num, media;
        int soma = 0;

        //Coleta da idade
        idade = s.next();

        //Soma de todas as posicoes do numero
        for (int i = 0; i < idade.length(); i++) {
            num = Integer.parseInt(idade.substring(i,i+1));
            soma = soma + num;
        }

        //media dos numeros
        media = soma / idade.length();
        System.out.println(media);
    }
}