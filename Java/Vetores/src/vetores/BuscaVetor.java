package vetores;

public class BuscaVetor {

    public static void main(String[] args) {
        int[] valores = {200, 32, 58, 40, 65, 77, 0, -8};

        int x = 737;
        boolean encontrada = false;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == x) {
                System.out.println("Valor encontrado! No indice: " + i);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Valor nao encontrado!");
        } 
    }
}
