package IntroducaoOO;

public class TesteLivroDeNotas {

    public static void main(String[] args) {

        //Declaracao do objeto livroDeNotas da classe LivroDeNotas
        //LivroDeNotas livroDeNotas;
        //Instanciando objeto livroDeNotas
        //livroDeNotas = new LivroDeNotas();
        //Declaracao do objeto e instanciacao
        LivroDeNotas livroA = new LivroDeNotas();
        
        livroA.exibirMensagem("P.O.O");
        
        //SETando nome do curso
        livroA.setNomeDoCurso("P.O.O");
        
        //GET pegando o nome do curso
        System.out.println(livroA.getNomeDoCurso());
        
        LivroDeNotas livroB = new LivroDeNotas();
        
        livroB.exibirMensagem("D.B.");
    }
}
