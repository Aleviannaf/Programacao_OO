package Aula10b;

public class Funcionario extends Pessoas{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }
    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
}
