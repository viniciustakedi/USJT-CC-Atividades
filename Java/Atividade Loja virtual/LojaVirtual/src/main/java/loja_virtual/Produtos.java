package loja_virtual;

public class Produtos {

    //alguns public pois o usuario precisa ter acesso comum
    public String[] produto = new String[10];
    public String[] preco = new String[10];
    public String[] qntEstoque = new String[10];
    public int idArray = 1;

    public Produtos() {
        //Cadastrando somente um produto
        this.produto[0] = "Garrafa de Dreher 3L";
        this.preco[0] = "R$10,00";
        this.qntEstoque[0] = "28";
    }

    public void cadastrarProduto(String p, String preco, String qntEstoque, int idP) {
        int idProduto = this.idArray;
                
        this.produto[idProduto] = p;
        this.preco[idProduto] = preco;
        this.qntEstoque[idProduto] = qntEstoque;
        
        this.idArray = idP;
    }

    public int getIdProduto() {
        return this.idArray;
    }

}
