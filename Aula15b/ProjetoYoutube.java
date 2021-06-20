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

       Visualizacao vis = new Visualizacao(g[0], v[1]);
       System.out.println(vis.toString());
    }
}
