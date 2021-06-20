package ultraemojicombat;

public class Lutador implements ControleLutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private String categoria;
    private float peso;
    private int vitorias, empates, derrotas;

    public Lutador(String no, String nac, int id, float alt, float pe, int vit, int emp, int der)
    {
            this.setNome(no);
            this.setNacionalidade(nac);
            this.setIdade(id);
            this.setAltura(alt);
            this.setPeso(pe);
            this.setVitorias(vit);
            this.setEmpates(emp);
            this.setDerrotas(der);
    }

    public String getNome() {
        return this.nome;
    }
    public String getCategoria() {
        return this.categoria;
    }
    private void setCategoria() {
        if(this.getPeso()<52.2){
            System.out.println("Peso invalido");
        } else if(this.getPeso()<=70.3){
            this.categoria = "Leve";
        } else if(this.getPeso()<=83.9){
            this.categoria = "Médio";
        } else if(this.getPeso()<= 120.2){
            this.categoria = "Pesado";
        } else {
            System.out.println("Peso invalido");
        }
    }

    public int getDerrotas() {
        return this.derrotas;
    }
    public void setDerrotas(int der) {
        this.derrotas = der;
    }
    public int getEmpates() {
        return this.empates;
    }
    public void setEmpates(int emp) {
        this.empates = emp;
    }
    public int getVitorias() {
        return this.vitorias;
    }
    public void setVitorias(int vit) {
        this.vitorias = vit;
    }
    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float pe) {
       this.peso = pe;
       this.setCategoria();
    }
    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float alt) {
        this.altura = alt;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    public void setNacionalidade(String nac) {
        this.nacionalidade = nac;
    }
    public void setNome(String no) {
        this.nome = no;
    }

    @Override
    public void apresentar() {
        System.out.println("-------------------------------");
        System.out.println("Lutador: "+ this.getNome());
        System.out.println("De "+this.getIdade()+" anos");
        System.out.println("De nacionalidade: "+ this.getNacionalidade());
        System.out.println("Pesando: "+ this.getPeso());
        System.out.println("Com "+this.getAltura()+" de altura");
        System.out.println("Da categoria: "+ this.getCategoria());
        System.out.println("Com um cartel de "+this.getVitorias()+
        " vitórias, "+this.getEmpates()+" empates e "+this.getDerrotas()+" derotas");
        
    }

    @Override
    public void status() {
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("Derrota: "+this.getDerrotas());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
    
}
