package Aula15b;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0]= new Video("Aula de Flutter");
        v[1]= new Video("Aula de Nextjs");
        v[2]= new Video("Aula de nodejs");

        Gafanhoto g[]= new Gafanhoto[2];
        g[0] = new Gafanhoto("Galileu", 22, "Masculino", "Galilei");
        g[1] = new Gafanhoto("Jubileia", 30, "Feminino", "JuJu");

       Visualizacao vis[] = new Visualizacao[5];
       vis[0] = new Visualizacao(g[0], v[2]); //Galileu assiste nodejs
       vis[0].avaliar();
       System.out.println(vis[0].toString());

       vis[1] = new Visualizacao(g[0], v[1]); // Galileu assiste flutter
       vis[0].avaliar(87.0f);
       System.out.println(vis[0].toString());

    }
}
