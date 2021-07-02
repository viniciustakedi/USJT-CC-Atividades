package vetordinamico;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // Lista de músicas:
        List<Musica> musicas = new ArrayList<>();

        String menu = " 0- Sair \n 1- Inserir música \n 2- Avaliar música \n "
                + "3- Ver a lista de músicas ordenada";

        int opcao;

        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {

                case 1: // Adicionar uma música:
                    // 1º entrada de dados: o nome da música.
                    String nomeMusica = JOptionPane.showInputDialog("Nome da música?");

                    // 2º Construir um objeto do tipo 'Musica'
                    Musica musica = new Musica(nomeMusica);

                    // 3º Adicionar a música à coleção:
                    musicas.add(musica);

                    System.out.println(musicas.size());

                    break;

                case 2:

                    // 1º passo: perguntar qual música que será avaliada:
                    String musicaAvaliar = JOptionPane.showInputDialog("Nome da música?");

                    // 2º passo: qual a nota a ser atribuída?
                    int nota = Integer.parseInt(JOptionPane.showInputDialog("Qual a nota?"));

                    // 3º passo: procurar no conjunto, uma música com o nome 'musicaAvaliar'?
                    for (int i = 0; i < musicas.size(); i++) {

                        if (musicas.get(i).getTitulo().equals(musicaAvaliar)) {
                            musicas.get(i).setAvalicao(nota);
                            System.out.println(musicas.get(i).getAvaliacao());
                            break;
                        }

                    }

                    break;
                case 3:
                    Collections.sort(musicas, Collections.reverseOrder());
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                case 0:
                    break;
            }

        } while (opcao != 0);
    }
}
