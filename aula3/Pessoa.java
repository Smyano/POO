public class Pessoa {
    private String nome;
    private int idade;


    
    public String getNome() {
        return nome;
    }

    public  void fazAniversario(){
        this.idade = this.idade +1;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}