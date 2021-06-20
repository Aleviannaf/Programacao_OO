package banco;

public class Aula05 {
    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta(111);
        p1.setDono("Jubileu da Silva");
        p1.abrirConta("cc");


        Banco p2 = new Banco();
        p2.setNumConta(112);
        p2.setDono("Creuza Pereira");
        p2.abrirConta("cp");

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
