package vetordinamico;

public class Musica implements Comparable<Musica> {
    
    /**
     * 
     */
    private String titulo;
    
    /**
     * 
     */
    private int avaliacao;

    public Musica() {
    }
    
    
    public Musica(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public int getAvaliacao() {
        return this.avaliacao;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAvalicao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    
    public int compareTo(Musica m) {
        if (this.avaliacao > m.getAvaliacao()) {
            return 1;
        }
        if (this.avaliacao < m.getAvaliacao()) {
            return -1;
        }
        return 0;

    }
    
    
    public String toString() {
        return String.format("Titulo: %s, Nota: %d/n", titulo, avaliacao);
    }

}