package aula9b;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Marco Polo", 22, "Masculino");

        p[1] = new Pessoa("Candido Andrade", 42, "Masculino");

        l[0] = new Livro("Macunaima", "Manoel Bandeira", 300, p[0]);
        l[0].abrir();
        l[1] = new Livro("Iracema", "José de Alencar", 330, p[1]);
        System.out.println(l[0].detalhes());  
    }
}
