package Aula10b;

public class Professor extends Pessoas{
    private String especialidade;
    private float salario;

    public void receberAum(float aum){
        this.setSalario(this.getSalario()+aum);
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
