package vetordinamico;

public class VetorDinamico {

    private int quantidade; //número de elementos no vetor
    private int capacidade; //tamanho atual do vetor
    int[] elementos;

    public VetorDinamico() {
        //this(4);
        this.capacidade = 4;
        this.elementos = new int[this.capacidade];
    }

    //sobrecarga do construtor
    public VetorDinamico(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[this.capacidade];
    }

    public boolean estaVazio() {
        return this.quantidade == 0;
    }

    public boolean estaCheio() {
        if (this.quantidade == this.capacidade) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaVazioTernario() {
        return this.quantidade == 0 ? true : false;
    }

    public void adicionar(int elemento) {
        if (this.estaCheio()) {
            this.redimensionar(2.0);
        }

        this.elementos[this.quantidade] = elemento;
        this.quantidade++;
    }

    //private void aumentarCapacidade() {
    //      System.out.println("Aumentou a capacidade!");
    //    this.capacidade = this.capacidade * 2;
    //  int[] aux = new int[this.capacidade];
    //for (int i = 0; i < this.quantidade; i++) {
    //  aux[i] = this.elementos[i];
    //}
    // this.elementos = aux;
    //}
    
    /**
     * Esse método remove o último elemento do vetor
     */
    public void remover() {
        if (!estaVazio()) {
            this.quantidade--;

            //Verifica se te muito espaço vazio no vetor "elementos"
            if (this.quantidade <= this.capacidade / 4 && this.quantidade > 4) {
                this.redimensionar(0.5);
            }
        }
    }

    /**
     * Esse método diminui o tamanho do vetor 'elementos' <b>pela metade</b>
     */
    public void reduzirCapacidade() {
        System.out.println("Reduziu a capacidade!");

        this.capacidade = this.capacidade / 2;
        int[] aux = new int[this.capacidade];
        for (int i = 0; i < this.quantidade; i++) {
            aux[i] = this.elementos[i];
        }
        this.elementos = aux;
    }

    /**
     * Este metodo redimensiona o vetor "elementos"
     *
     * @param fator se &ge; 1.0 entao aumenta, se &gt; 1.0 entao diminui
     */
    public void redimensionar(double fator) {
        //fazendo um casting forcado de valores:
        this.capacidade = (int) (this.capacidade * fator);
        int[] aux = new int[this.capacidade];
        for (int i = 0; i < this.capacidade; i++) {
            aux[i] = this.elementos[i];
        }

        this.elementos = aux;
    }
}
