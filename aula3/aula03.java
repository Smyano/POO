public class aula03{

    public static void main(String args[] ) {
        // System.out.println("oi");

        // Pessoa p1 = new Pessoa("Mara", 20);
        // Pessoa p2 = new Pessoa("Joao", 30);
        //System.out.println(p1.getNome());

        Aluno a1 = new Aluno( "Joao", 23, "Medicina", 9.0, 100000 );
        a1.fazAniversario();
        a1.verificaAprovacao();
        a1.pagarMensalidade();
        a1.curso();
        System.out.println(a1.getIdade());
        System.out.println(a1.getNome()); 


        Aluno a2 = new AlunoBolsista( "Maria", 25, "Arquitetura", 8.0, 2000 );
        a2.fazAniversario();
        a2.verificaAprovacao();
        a2.pagarMensalidade();
        a2.curso();
        System.out.println(a1.getIdade());
        System.out.println(a1.getNome()); 

        // Professor prof1 = new Professor("Marcio", 50, 15, 47000);
        // prof1.fazAniversario();
        // prof1.recebeSalario();
        // System.out.println(prof1.getIdade());
        // System.out.println(prof1.getNome()); 

    }

    
}