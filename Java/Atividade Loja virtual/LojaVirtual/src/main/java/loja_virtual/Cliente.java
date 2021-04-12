package loja_virtual;

public class Cliente {

    private String nomeCompleto;
    private String email;
    private String senha;
    private String cpf;
    private String dadosEndereco;
    
    /* Bloco construtor sem parametros */
    public Cliente() {
        System.out.println("Seja muito bem-vindo a nossa loja!");
    
    }
    /* Bloco construtor com parametros */
    public Cliente(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    
    /* metodo SET para cadastrar um cliente */
    public void setCliente(String n, String e, String s, String c, String d) {
        this.nomeCompleto = n;
        this.email = e;
        this.senha = s;
        this.cpf = c;
        this.dadosEndereco = d;
    }
    
    //Get para pegar o email do usuario
    public String getDados() {
        return email;
    }
}
