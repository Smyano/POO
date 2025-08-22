public class Aluno extends Pessoa{
    
     String curso;
     double nota;
     double  mensalidade;

    public Aluno(String nome, int idade, String curso, double nota, double mensalidade) {
        setNome(nome);
        setIdade(idade);
        this.curso = curso;
        this.nota = nota;
        this.mensalidade = mensalidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void curso() {
        System.out.println( "Seu curso é " + this.curso);
     }

    public void verificaAprovacao() {
        if (this.nota >= 6.0){
        System.out.println("Aluno aprovado com a nota " + this.nota);
    } else {
        System.out.println("Aluno reprovado, sua nota foi " + this.nota);
    }
}   public void pagarMensalidade() {
        System.out.println( getNome() + " tem a mensalidade paga!");
     }  
    }
    
    


