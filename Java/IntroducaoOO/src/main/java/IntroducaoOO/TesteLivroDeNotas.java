package IntroducaoOO;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        
        //Declaracao do objeto livroDeNotas da classe LivroDeNotas
        LivroDeNotas livroDeNotas;
        //Instanciando objeto livroDeNotas
        livroDeNotas = new LivroDeNotas();
        
        livroDeNotas.exibirMensagem();
        
        LivroDeNotas testeLivro = new LivroDeNotas();
        testeLivro.exibirMensagem();
    }
}
