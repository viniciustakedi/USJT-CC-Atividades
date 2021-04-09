package IntroducaoOO;

public class LivroDeNotas {

    //Especificaros atributos
    private String nomeDoCurso;

    //Lista de metodos (acoes)
    public void exibirMensagem(String nomeDoCurso) 
    {
        System.out.println("Bem-vindo ao livro de notas do curso " + nomeDoCurso);
    }

    //Metodo GET para o nomeDoCurso
    public String getNomeDoCurso()
    {
        return nomeDoCurso;
    }
    
    //Metodo SET para o nomeDoCurso
    public void setNomeDoCurso(String nome)
    {
        this.nomeDoCurso = nome;
    }

}
