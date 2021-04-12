package loja_virtual;

public class Produtos {
    
    //alguns public pois o usuario precisa ter acesso comum
    public String[] produto;
    public String[] preco;
    private String[] qntEstoque;
    
    public void cadastrarProduto(String p, String preco, String qntEstoque) {
        
        int idProduto = this.produto.length;
        
        this.produto[idProduto] = p;
        this.preco[idProduto] = preco;
        this.qntEstoque[idProduto] = qntEstoque;
        System.out.println(idProduto);
    }
    
    public String getProduto() {
        return this.produto[0];
    }

}
